package com.user.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Entity
@Table(name = "user_master")
@Data
public class UserMaster {
	@Id
	private long                 	userId ;
	private String          	firstName   ;
	private String          	middleName  ;
	private String               	lastName;
	private long            	primaryMobile;
	private long       	secondaryMobile  ;
	private String          	primaryEmail;
	private String     	secondaryEmail   ;
	private String                         	Address1	;	
	private String                         	Address2	;	
	private String                    	streetName	;
	private String                         	stateCode	;	
	private String                    	districtCode	;
	private long       pinCode	;	
	private Date                 	addDate;
	private String               	intro  ;
	private String               	profile;
	private String                    	authFlag			;
	private long                      	blogCount			;
	private long                      	followersCnt		;
	private long                      	followingCnt		;
	private String                    	status			;
	private byte                      	contactVerifyFlag	;
	private String	gender;
	private String	professionCode;
	
	
	
}
