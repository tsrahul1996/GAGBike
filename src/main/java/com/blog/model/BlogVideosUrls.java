package com.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_videos_urls")
@NoArgsConstructor @Data
public class BlogVideosUrls {
	
	@Id
	private  long    urlId;			                                                                       
	private  long    blogId;		                                                                     
	private  String  url; 			                                                                 
	private  Date    addDate;
	
}
