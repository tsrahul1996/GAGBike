package com.GeneralServices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "state_master_temp")
@NoArgsConstructor @Data
public class StateMaster {

	@Id    
	@Column(name ="country_code")
	private String countryCode ;       
	
	@Column(name ="state_code")
	private String stateCode;    
	
	@Column(name ="state_name_caps")
	private String stateNameCaps;
	
	@Column(name ="state_name_reg")
	private String    stateNameReg;
	
	@Column(name ="min_pin_prefix")
	private int minPinPrefix;   
	
	@Column(name ="max_pin_prefix")
	private int maxPinPrefix;   
	
	@Column(name ="status")
	private String status; 		
	

 

}
