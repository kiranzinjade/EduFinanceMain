package com.webcorestone.EduFinance.app.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webcorestone.EduFinance.app.modelInformation.EmailSender;
import com.webcorestone.EduFinance.app.service.EmailService;

@RestController
public class EmailController 
{
	@Autowired
	EmailService es;
	
	@Value("${spring.mail.username}")
	private String fromEmail;

		@RequestMapping(value = "/sendEmail",method = RequestMethod.POST)
		public  String sendEmail(@RequestBody EmailSender sender) {
			sender.setFromEmail(fromEmail);
			try {
				es.sendEmail(sender);
			} catch (Exception e) {
				e.printStackTrace();
				return "email can not be sent";
			}
			return "mail send successully";
		}
		
		
		@RequestMapping(value = "/mail", method = RequestMethod.POST,consumes = MediaType.ALL_VALUE)
		public void sendMail(
				@RequestPart(required = true, value = "Attachfile") MultipartFile file1,
				@RequestPart("toEmail") String toemail) throws IOException, MessagingException {
			EmailSender em= new EmailSender();
			ObjectMapper om = new ObjectMapper();
			EmailSender value = om.readValue(toemail,EmailSender.class);
			em.setFromEmail(value.getFromEmail());
			em.setToEmail(value.getToEmail());
			
			//em.setTextBody("Your Company sign-in mail Id : "+value.getCompanyEmailId()+"\n"+"Your Designation : "+value.getDesignation()+"\n"+"Your User Name : "+value.getUsername()+"\n"+"Your Password : "+value.getPassword());
			System.out.println(toemail);
			System.out.println(value.getToEmail());
			System.out.println(file1.getOriginalFilename());
			es.sendMailWithAttachmentFromFrontEnd(em.getToEmail(),em, file1);
		}
		
		@PostMapping(value = "/sendEmailwithAttachment")
		public  String sendEmailwithAttachment(@RequestBody EmailSender sender) {
			sender.setFromEmail(fromEmail);
			
			try {
				es.sendEmailwithAttachment(sender);
			} catch (Exception e) {
				
				return "email can not be sent";
			}

			return "mail send successully";
		}
}
