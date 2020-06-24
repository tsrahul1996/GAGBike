package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.user.dao.UniversalLoginDao;
import com.user.dao.UniversalLoginStgDao;
import com.user.model.UniversalLogin;
import com.user.model.UniversalLoginStg;
import com.user.service.UserSignUpService;

import java.io.IOException;
import java.net.URI;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
//@CrossOrigin(origins = {"http://150.1.18.138:4200","http://localhost:4200","http://150.1.16.146:8080"},methods = RequestMethod.POST)
@CrossOrigin(origins = "*",methods = RequestMethod.POST)
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
	public ResponseEntity<UniversalLoginStg> save(@RequestBody UniversalLoginStg universalLoginStg) throws AddressException, MessagingException, IOException {

		UniversalLoginStg confirmationToken = new UniversalLoginStg(universalLoginStg);
		universalLoginStg.setTokenNo(confirmationToken.getTokenNo());
		universalLoginStg.setAddDate(confirmationToken.getAddDate());
		
		String email = "";
		email = universalLoginStg.getPrimaryEmail();
    	UniversalLoginStg user1 =  universalLoginStgDao.findByPrimaryEmail(email);
    	UniversalLogin user2 = 	   universalLoginDao.findByPrimaryEmail(email);
    	
    	UniversalLoginStg result = new UniversalLoginStg();
    	
    	if(user1 == null && user2 == null)
    	{
    		result = userSignUpService.save(universalLoginStg);
    		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(universalLoginStg.getStgUserId()).toUri();
    		return ResponseEntity.status(HttpStatus.OK).build();	
    	}
       else
        {
    	   result = null;
    	   return ResponseEntity.notFound().build();
        }
  
	}

	@GetMapping(path = "/userSignUpSave")
	public String save()  {
		
		return "success";
	}
}
