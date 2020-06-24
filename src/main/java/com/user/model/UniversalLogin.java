package com.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Entity
@Table(name = "universal_login")
@Data
public class UniversalLogin {
	

	@Id
	@Column(name ="country_code")
	private long userId; 
	private long primaryMobile;
	private long secondaryMobile;
	private String primaryEmail; 
	private String secondaryEmail; 
	private String passwordHash; 
	private Date addDate;
	private Date registeredAt ;
	private Date lastLogin ; 							
	private byte failureCount;
	private Date lastPwdChngDt;
	private String status;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getPrimaryMobile() {
		return primaryMobile;
	}
	public void setPrimaryMobile(long primaryMobile) {
		this.primaryMobile = primaryMobile;
	}
	public long getSecondaryMobile() {
		return secondaryMobile;
	}
	public void setSecondaryMobile(long secondaryMobile) {
		this.secondaryMobile = secondaryMobile;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
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
	public Date getRegisteredAt() {
		return registeredAt;
	}
	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public byte getFailureCount() {
		return failureCount;
	}
	public void setFailureCount(byte failureCount) {
		this.failureCount = failureCount;
	}
	public Date getLastPwdChngDt() {
		return lastPwdChngDt;
	}
	public void setLastPwdChngDt(Date lastPwdChngDt) {
		this.lastPwdChngDt = lastPwdChngDt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
