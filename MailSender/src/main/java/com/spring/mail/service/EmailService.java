package com.spring.mail.service;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import jakarta.mail.internet.MimeMessage;

@Component
public class EmailService {

	
	@Autowired
	private JavaMailSender mailsender;
	
	@Autowired
	private Configuration config;
	
	
	public void sendEmail(Map<String,Object> model) {
		
		try {
			MimeMessage message = mailsender.createMimeMessage();
			MimeMessageHelper helper =new MimeMessageHelper(message,MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,StandardCharsets.UTF_8.name());			
			Template template=config.getTemplate("email-template.ftl");
			String html=FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setSubject("Error Notification  for Opensips API Request");
			helper.setTo("vikas@pandorarndlabs.com");
			helper.setText(html, true);
			helper.setFrom("opensipsgatewayservice@gmail.com");
			mailsender.send(message);
			System.out.println("mail sent....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
