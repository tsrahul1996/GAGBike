package com.GeneralServices.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.GeneralServices.model.PincodeMaster;
import com.blog.model.BlogPost;

public interface PincodeMasterDAO extends CrudRepository<PincodeMaster, Integer> {

	Optional<PincodeMaster> findByPincode(int pincode);
	//public List<PincodeMaster> findByPincode(int id); 
	
}
