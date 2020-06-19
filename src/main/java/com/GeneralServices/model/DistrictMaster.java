package com.GeneralServices.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "district_master")
@NoArgsConstructor @Data
@IdClass(DistrictMaster.class)
public class DistrictMaster implements Serializable{
	@Id  	
	private String country_code ;
	@Id
	private String district_code; 
	private String state_code  ;  
	private String district_name ;
	private String status;      
	
	
}
