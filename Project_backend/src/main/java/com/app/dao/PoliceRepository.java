package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Police;

public interface PoliceRepository extends JpaRepository<Police, Integer> {
	@Query("select p from Police p where p.policeEmail=:em and p.policePassword=:pass")
	Optional<Police> validatePolice(@Param("em") String email, @Param("pass") String pwd);
	
	Optional<Police> findByPoliceEmailAndPolicePassword(String policeEmail, String policePassword);

}
