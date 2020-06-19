package com.blog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blog_club_master")
@NoArgsConstructor @Data
public class BlogClubMaster {

@Id
private long   clubId;		                  
private String clubCategory;	    
private String clubName	;	             
private Date   start_date;	            
private Date   end_date;		         
private Date addDate;		                  

}
