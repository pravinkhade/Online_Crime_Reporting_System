package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.userEmail =:em and u.userPassword=:pass")
	Optional<User> validateUser(@Param("em") String userEmail, @Param("pass") String userPassword);
}
