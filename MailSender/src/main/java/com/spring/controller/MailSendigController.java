package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mail.service.EmailService;

@RestController
public class MailSendigController {

	@Autowired 
	private EmailService service;
	
	@PostMapping("/sendingmail")
	public String sendGmail( ) {
		Map<String,Object> model= new HashMap();
		model.put("username", "Vikas");
		model.put("purpose", "Testing");
		service.sendEmail(model);
		return "mail sent from service";
	}
	
}
