package com.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_photos")
@NoArgsConstructor @Data
public class BlogPhotos {
	@Id
	private  long   blogId;		                                                                        
	private  String photoBase64	;	                                                             
	private  Date   addDate	;
}
