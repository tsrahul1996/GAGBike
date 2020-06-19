package com.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_club_usr_map")
@NoArgsConstructor @Data
public class BlogClubUsrMap {
	
 @Id   
private  long    userId;      
private  long    clubId;      
private  Date    start_date;
private  Date    end_date;  
private  Date    addDate;    
private  String  status;  

}
