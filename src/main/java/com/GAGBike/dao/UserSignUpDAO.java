package com.GAGBike.dao;

import org.springframework.data.repository.CrudRepository;

import com.GAGBike.model.UniversalLoginStg;

public interface UserSignUpDAO extends CrudRepository<UniversalLoginStg, Long>{
	
	UserSignUpDAO findByTokenNo(int confirmationToken);
	UserSignUpDAO findByPrimaryEmail(String primaryEmail);
	
}
