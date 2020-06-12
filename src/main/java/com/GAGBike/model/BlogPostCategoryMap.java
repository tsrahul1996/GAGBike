package com.GAGBike.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_post_category_map")
@NoArgsConstructor @Data
public class BlogPostCategoryMap {
	
	@Id
	private  long  blogId ;			                                                                         
	private  long  categoryId ;
	
}
