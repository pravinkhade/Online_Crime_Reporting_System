package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.ComplaintArticle;

public interface CompArticleRepository extends JpaRepository<ComplaintArticle, Integer> {

}
