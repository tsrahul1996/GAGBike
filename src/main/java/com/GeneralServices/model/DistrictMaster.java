package com.GeneralServices.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "district_master_temp")
@NoArgsConstructor @Data
public class DistrictMaster implements Serializable{
	
	@Id
	@Column(name ="country_code")
	private String countryCode ;
	
	@Column(name ="district_code")
	private String districtCode; 
	
	@Column(name ="state_code")
	private String stateCode  ;  
	
	@Column(name ="district_name")
	private String districtCame ;
	
	@Column(name ="status")
	private String status;      
	/*
	 * @OneToMany(mappedBy = "district_code") private List<PincodeMaster> items =
	 * new ArrayList<PincodeMaster>();
	*/
	
}
