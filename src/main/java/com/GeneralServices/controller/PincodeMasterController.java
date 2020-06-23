package com.GeneralServices.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralServices.dao.PincodeMasterDAO;
import com.GeneralServices.model.PincodeMaster;
import com.blog.model.BlogPost;

@RestController
public class PincodeMasterController {

	@Autowired
	PincodeMasterDAO pincodeMasterDAO;
	
	@PostMapping(path = "/select")
	public Optional<PincodeMaster> save(@RequestBody PincodeMaster pincode) throws IOException  {

		
	//	return pincodeMasterDAO.findByPincode(pincode.getPincode());
		return pincodeMasterDAO.findByPincode(pincode.getPincode());
	}

}
