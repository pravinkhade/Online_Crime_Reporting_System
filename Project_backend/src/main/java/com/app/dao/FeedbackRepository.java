package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Feedback;
import com.app.pojos.User;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

	}
