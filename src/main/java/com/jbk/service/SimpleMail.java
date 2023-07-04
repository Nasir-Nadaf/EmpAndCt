package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SimpleMail {
	@Autowired
	private JavaMailSender mailsender;
	
	public void sendMail(String toEmail,String subject,String body) {
		System.out.println("preparing mail");
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom("nasirnadaf341@gmail.com");
		msg.setTo(toEmail);
		msg.setSubject(subject);
		msg.setText(body);
		
		mailsender.send(msg);
		System.out.println("mail send successfully....");
	}

}
