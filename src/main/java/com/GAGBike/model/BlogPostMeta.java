package com.GAGBike.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_post_meta")
@NoArgsConstructor @Data
public class BlogPostMeta {
	
	@Id
	private  long    metaId;                                                                   
	private  long    blogId;	                                                                   
	private  String  key;	
	
}
