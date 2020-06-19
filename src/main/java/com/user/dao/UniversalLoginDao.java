package com.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.model.UniversalLogin;
 
public interface UniversalLoginDao extends CrudRepository<UniversalLogin, Long>{

	UniversalLogin findByPrimaryEmail(String primaryEmail);
	
}
	
