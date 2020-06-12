package com.GAGBike.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class UserConroller {


	@RequestMapping("/testControllerMethod")
	public String testControllerMethod() {
		return "login";
	}

}
