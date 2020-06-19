package com.GeneralServices.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "state_master")
@NoArgsConstructor @Data
public class StateMaster {

	
	@Id                                
	private String country_code ;                                 
	private String state_code;     
	private String state_name_caps;   
	private String    state_name_reg;  
	private int min_pin_prefix;      
	private int max_pin_prefix;      
	private String status; 		

}
