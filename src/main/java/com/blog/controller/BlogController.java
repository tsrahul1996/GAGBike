package com.blog.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.BlogPostDAO;
import com.blog.model.BlogPost;
import com.blog.service.BlogPostService;
import com.user.model.UniversalLoginStg;
@RestController
@CrossOrigin(origins = "*")
public class BlogController {
	
	@Autowired
	BlogPostService blogPostService;
	
	@Autowired
	BlogPostDAO blogPostDAO;
	
	@PostMapping(path = "/saveBlog")
	public String saveBlog(@RequestBody BlogPost blogPost) throws IOException  {
		BlogPost TempBlogPost = new BlogPost(blogPost);
		
		blogPostService.save(blogPost);
		return "success";
	}
	
	@GetMapping(path = "/blogSelectAll")
	public ArrayList<BlogPost> selectAll() {
		
		return blogPostService.selectAll();
	}

}
