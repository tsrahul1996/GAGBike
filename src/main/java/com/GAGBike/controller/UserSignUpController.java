package com.GAGBike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.GAGBike.dao.UserSignUpDAO;
import com.GAGBike.model.UniversalLoginStg;
import com.GAGBike.service.UserSignUpService;

@RestController
public class UserSignUpController {

	@Autowired
	UserSignUpService userSignUpService;
	
	@Autowired
	UserSignUpDAO userSignUpDAO;

	public static final Logger log = LoggerFactory.getLogger(UserSignUpController.class);

	@GetMapping("/index")
	public String populateLogin() {

		return "login";
	}
	
	@RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
	public String confirmUserAccount(@RequestParam("token")String confirmationToken) {
		int tokenNo = Integer.parseInt(confirmationToken);
		UniversalLoginStg token =  (UniversalLoginStg) userSignUpDAO.findByTokenNo(tokenNo);

        if(token != null)
        {
        	UniversalLoginStg user =  (UniversalLoginStg) userSignUpDAO.findByPrimaryEmail(token.getPrimaryEmail());
        	user.setStatus("A");
        	userSignUpDAO.save(user);
           // modelAndView.setViewName("accountVerified");
        }
        else
        {
          //  modelAndView.addObject("message","The link is invalid or broken!");
          //  modelAndView.setViewName("error");
        }
		return 	"success";
	}
	
	@PostMapping(path = "/userSignUpSave")
	public String userSignUpSelect(@RequestBody UniversalLoginStg universalLoginStg) throws AddressException, MessagingException, IOException {

		UniversalLoginStg confirmationToken = new UniversalLoginStg(universalLoginStg);
       
		userSignUpService.save(universalLoginStg);

		return "success";
	}
	
}
