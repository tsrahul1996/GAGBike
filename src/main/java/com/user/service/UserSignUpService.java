package com.user.service;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.user.dao.UniversalLoginStgDao;
import com.user.model.Mail;
import com.user.model.UniversalLoginStg;



@Service 
public class UserSignUpService {
	
    @Autowired
    UniversalLoginStgDao universalLoginStgDao;
	
    @Autowired
    private EmailSenderService emailSenderService;
    
	public UniversalLoginStg save(UniversalLoginStg user) throws AddressException, MessagingException, IOException {
		
		String URLString = "";
		
		String  password= user.getPasswordHash();
		
		int token = user.getTokenNo();
		
		URLString = "http://localhost:8080/confirm-account?token="+token;
		String mailTo= user.getPrimaryEmail();
		
		Mail mail = new Mail();
        mail.setFrom("tsrahul1996@gmail.com");//replace with your desired email
        mail.setTo(user.getPrimaryEmail());//replace with your desired email
        mail.setSubject("Account Verification");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", user.getFirstName());
        model.put("url", URLString);
        model.put("token", token);
        mail.setProps(model);
      //  emailSenderService.sendEmail(mail);
	      
        return universalLoginStgDao.save(user);
	}
	


}
