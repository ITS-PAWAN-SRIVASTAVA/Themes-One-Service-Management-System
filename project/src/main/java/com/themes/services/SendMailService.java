package com.themes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {

	@Autowired
	private JavaMailSender mailSender;
	
	
	
	public void sendEmail(String toMail, String subject, String body)
	{
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		mailMessage.setFrom("ritik.masters.mca@gmail.com");
		mailMessage.setTo(toMail);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		
		mailSender.send(mailMessage);
		
		System.out.println("Mail Sent successfully");
		
		
		
	}
	
}
