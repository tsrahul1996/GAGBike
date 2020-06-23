package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.dao.UniversalLoginDao;
import com.user.dao.UniversalLoginStgDao;
import com.user.model.UniversalLogin;
import com.user.model.UniversalLoginStg;
import com.user.service.UserSignUpService;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserSignUpController {

	@Autowired
	UserSignUpService userSignUpService;
	
	@Autowired
	UniversalLoginStgDao universalLoginStgDao;

	@Autowired
	UniversalLoginDao universalLoginDao;
	
	public static final Logger log = LoggerFactory.getLogger(UserSignUpController.class);

	@GetMapping("/index")
	public String populateLogin() {

		return "login";
	}
	
	@RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
	public String confirmUserAccount(@RequestParam("token")String confirmationToken) {
		int tokenNo = Integer.parseInt(confirmationToken);
		UniversalLoginStg token =  (UniversalLoginStg) universalLoginStgDao.findByTokenNo(tokenNo);

		return 	"success";
	}
	
	@PostMapping(path = "/userSignUpSave")
	public String save(@RequestBody UniversalLoginStg universalLoginStg) throws AddressException, MessagingException, IOException {

		UniversalLoginStg confirmationToken = new UniversalLoginStg(universalLoginStg);
		universalLoginStg.setTokenNo(confirmationToken.getTokenNo());
		universalLoginStg.setAddDate(confirmationToken.getAddDate());
		
		String email = "";
		email = universalLoginStg.getPrimaryEmail();
    	UniversalLoginStg user1 =  universalLoginStgDao.findByPrimaryEmail(email);
    	UniversalLogin user2 = 	   universalLoginDao.findByPrimaryEmail(email);
    	
    	if(user1 == null && user2 == null)
    	{
		userSignUpService.save(universalLoginStg);
    	}
       else
        {
          //  modelAndView.addObject("message","User Already Exist");
          //  modelAndView.setViewName("error");
        }
		return "success";
	}

	@GetMapping(path = "/userSignUpSave")
	public String save()  {
		
		return "success";
	}
}
