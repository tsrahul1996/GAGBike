package com.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.model.UniversalLoginStg;
 
public interface UniversalLoginStgDao extends CrudRepository<UniversalLoginStg, Long>{
	
	UniversalLoginStgDao findByTokenNo(int confirmationToken);
	UniversalLoginStg findByPrimaryEmail(String primaryEmail);
	
}
