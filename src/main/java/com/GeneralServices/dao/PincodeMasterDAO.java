package com.GeneralServices.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GeneralServices.model.PincodeMaster;
import com.blog.model.BlogPost;

public interface PincodeMasterDAO extends CrudRepository<PincodeMaster, Long> {
	//public List<PincodeMaster> findByPincode(int id); 
	
}
