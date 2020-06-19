package com.blog.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.BlogPostDAO;
import com.blog.model.BlogPost;
import com.user.model.UniversalLoginStg;


@Service
public class BlogPostService {

	@Autowired
	BlogPostDAO blogPostDAO;
	
	public void save(BlogPost blog) throws  IOException {
		blog.setCreatedAt(new Date());
		blog.setUpdatedAt(new Date());
		blog.setPublishedAt(new Date());
		blog.setAuthDate(new Date());
		
		blogPostDAO.save(blog);
	}

	public ArrayList<BlogPost> selectAll() {
		ArrayList<BlogPost> al = new ArrayList<BlogPost>();
		al.addAll( (Collection<? extends BlogPost>) blogPostDAO.findAll());
		return al;
	}
	
}
