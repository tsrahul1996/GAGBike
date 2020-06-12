package com.GAGBike.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_user_achievements")
@NoArgsConstructor @Data
public class BlogUserAchievements {
	
	@Id
	private  long   achblogId;					                                                                   
	private  long   userId;					                                                                     
	private  long   clubId;					                                                                     
	private  String achCategory;			                                                                 
	private  Date   start_date;	                                                                 
	private  Date   end_date;		                                                                   
	private  Date   addDate;
	
}
