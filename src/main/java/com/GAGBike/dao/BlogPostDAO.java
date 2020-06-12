package com.GAGBike.dao;

import org.springframework.data.repository.CrudRepository;

import com.GAGBike.model.BlogPost;

public interface BlogPostDAO extends CrudRepository<BlogPost, Long> {

	

}
