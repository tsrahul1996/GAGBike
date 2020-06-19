package com.blog.dao;

import org.springframework.data.repository.CrudRepository;

import com.blog.model.BlogPost;

public interface BlogPostDAO extends CrudRepository<BlogPost, Long> {


}
