package com.blog.model;

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
	

	
	public long getBlogId() {
		return blogId;
	}
	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMetaTitle() {
		return metaTitle;
	}
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public long getPublished() {
		return published;
	}
	public void setPublished(long published) {
		this.published = published;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Date getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}
	public long getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(long replyCount) {
		this.replyCount = replyCount;
	}
	public long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}
	public long getViewCount() {
		return viewCount;
	}
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAuthFlag() {
		return authFlag;
	}
	public void setAuthFlag(String authFlag) {
		this.authFlag = authFlag;
	}
	public String getAuthUser() {
		return authUser;
	}
	public void setAuthUser(String authUser) {
		this.authUser = authUser;
	}
	public Date getAuthDate() {
		return authDate;
	}
	public void setAuthDate(Date authDate) {
		this.authDate = authDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
