package com.GAGBike.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uni_login_ext_credentials")
@NoArgsConstructor @Data
public class UniLoginExtCredentials {
	
	@Id
	private long    userId;                                                                     
	private String  extLoginType;                                                           
	private Date    addDate;                                                              
	private Date    registeredDate;                                                           
	private Date    lastLogin;	                                                               
	private String  status;	
	
}
