package com.webcorestone.EduFinance.app.service;

import javax.mail.MessagingException;

import org.springframework.web.multipart.MultipartFile;

import com.webcorestone.EduFinance.app.modelInformation.EmailSender;

public interface EmailService {

	void sendEmail(EmailSender sender);

	void sendMailWithAttachmentFromFrontEnd(String toEmail, EmailSender em, MultipartFile file1) throws MessagingException;

	void sendEmailwithAttachment(EmailSender sender);
}
