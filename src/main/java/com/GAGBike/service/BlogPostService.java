package com.GAGBike.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GAGBike.dao.BlogPostDAO;
import com.GAGBike.model.BlogPost;
import com.GAGBike.model.UniversalLoginStg;


@Service
public class BlogPostService {

	@Autowired
	BlogPostDAO blogPostDAO;
	
	public void save(BlogPost blog) throws  IOException {
		
		blogPostDAO.save(blog);
	}

	public ArrayList<BlogPost> selectAll() {
		ArrayList<BlogPost> al = new ArrayList<BlogPost>();
		al.addAll( (Collection<? extends BlogPost>) blogPostDAO.findAll());
		return al;
	}
}
