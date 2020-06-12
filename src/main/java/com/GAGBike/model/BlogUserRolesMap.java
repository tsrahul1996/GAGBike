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
@Table(name = "blog_user_roles_map")
@NoArgsConstructor @Data
public class BlogUserRolesMap {
	
	@Id
	private long  	userId;
	private short 	roleId;
	private Date  	addDate;
	private String	status;
	
}
