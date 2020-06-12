package com.GAGBike.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "blog_usr_followers_map")
@NoArgsConstructor @Data
public class BlogUsrFollowersMap {
	
	@Id
	private   long     userId;                             
	private   long     followerId;                             
	private   String   followType;                             
	private   Date     start_date;                             
	private   Date     end_date;                             
	private   Date     addDate;                             
	private   String   status;  
	
}
