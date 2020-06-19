package com.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_category_master")
@NoArgsConstructor @Data
public class BlogCategoryMaster {
	
	@Id
	private  long    catId;	
	
	private  long    parentCatId;
	private  String  title;		
	private  String  metaTitle;	
	private  String  slug;		
	private  String  content;	
}
