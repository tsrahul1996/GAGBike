package com.GAGBike.model;


import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Entity
@Table(name = "universal_login_stg")
@Data
@ConfigurationProperties("app")
public class UniversalLoginStg {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long stgUserId;
private String firstName;
private String lastName;
private String primaryMobile;
private String primaryEmail;
private String passwordHash;
private Date addDate;
private int tokenNo;
private String status;

public long getStgUserId() {
	return stgUserId;
}
public void setStgUserId(long stgUserId) {
	this.stgUserId = stgUserId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPrimaryMobile() {
	return primaryMobile;
}
public void setPrimaryMobile(String primaryMobile) {
	this.primaryMobile = primaryMobile;
}
public String getPrimaryEmail() {
	return primaryEmail;
}
public void setPrimaryEmail(String primaryEmail) {
	this.primaryEmail = primaryEmail;
}
public String getPasswordHash() {
	return passwordHash;
}
public void setPasswordHash(String passwordHash) {
	this.passwordHash = passwordHash;
}
public Date getAddDate() {
	return addDate;
}
public void setAddDate(Date addDate) {
	this.addDate = addDate;
}
public int getTokenNo() {
	return tokenNo;
}
public void setTokenNo(int tokenNo) {
	this.tokenNo = tokenNo;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

public int generateTokenNo(){
Random random = new Random();
int tokenNo = 100000 + random.nextInt(900000);
return tokenNo;
 }

public UniversalLoginStg(long stgUserId, String firstName, String lastName, String primaryMobile, String primaryEmail,
		String passwordHash, Date addDate, long tokenNo, String status) {
	super();
	this.stgUserId = stgUserId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.primaryMobile = primaryMobile;
	this.primaryEmail = primaryEmail;
	this.passwordHash = passwordHash;
	this.addDate =  new Date();
	this.tokenNo =  generateTokenNo();
	this.status = status;
}
public UniversalLoginStg(UniversalLoginStg universalLoginStg) {
	this.addDate =  new Date();
	this.tokenNo = generateTokenNo();
}


}
