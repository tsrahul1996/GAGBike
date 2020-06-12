package com.GAGBike.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Entity
@Table(name = "blog_Post")
@Data
public class BlogPost {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long blogId;
	private long userId;
	private long parentId;
	private String title;
	private String metaTitle;
	private String slug;
	private String summary;
	private long published;
	private Date createdAt;
	private Date updatedAt;
	private Date publishedAt;
	private long replyCount;
	private long likeCount;
	private long viewCount;
	private String status;
	private String authFlag;
	private String authUser;
	private Date authDate;
	private String content;
	
	public BlogPost() {
		
	}
	public BlogPost(long blogId, long userId, long parentId, String title, String metaTitle, String slug,
			String summary, long published, Date createdAt, Date updatedAt, Date publishedAt, long replyCount,
			long likeCount, long viewCount, String status, String authFlag, String authUser, Date authDate,
			String content) {
		super();
		this.blogId = blogId;
		this.userId = userId;
		this.parentId = parentId;
		this.title = title;
		this.metaTitle = metaTitle;
		this.slug = slug;
		this.summary = summary;
		this.published = published;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.replyCount = replyCount;
		this.likeCount = likeCount;
		this.viewCount = viewCount;
		this.status = status;
		this.authFlag = authFlag;
		this.authUser = authUser;
		this.authDate = authDate;
		this.content = content;
	}
	
	public BlogPost(BlogPost blogPost) {
		this.createdAt =  new Date();
		this.updatedAt =  new Date();
		this.publishedAt =  new Date();
		this.authDate =  new Date();
	}
	
}
