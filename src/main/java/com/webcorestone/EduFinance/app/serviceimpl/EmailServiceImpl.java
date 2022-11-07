package com.webcorestone.EduFinance.app.serviceimpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.webcorestone.EduFinance.app.modelInformation.EmailSender;
import com.webcorestone.EduFinance.app.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	JavaMailSender mailSender;

	@Override
	public void sendEmail(EmailSender sender) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(sender.getToEmail());
		message.setFrom(sender.getFromEmail());
		message.setSubject(sender.getSubject());
		// sender.setTextBody("Your Company sign-in mail Id :
		// "+sender.getCompanyEmailId()+"\n"+"Your Designation :
		// "+sender.getDesignation()+"\n"+"Your User Name :
		// "+sender.getUsername()+"\n"+"Your Password : "+sender.getPassword());
		message.setText(sender.getTextBody());

		mailSender.send(message);
		System.out.println("send mail");

	}

	@Override
	public void sendMailWithAttachmentFromFrontEnd(String toEmail, EmailSender em, MultipartFile file1)
			throws MessagingException {

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);// multiport = true
		helper.setFrom("gopalbhutekar3@gmail.com");
		helper.setTo(toEmail);
		helper.setText(em.getTextBody() + "\nDear " + em.getFromEmail()
				+ ",\n\n Please find the Attachment. \n This is generated Offer letter ,\n Please visit branch for any Query or contact Your Manager.\n Thank You !\n\n Regards,\n CJC family.");
		helper.setSubject("Loan Sanction Letter");

		helper.addAttachment("Sanction Letter.pdf", file1);

		mailSender.send(message);
		System.out.println("mail sent for sanction letter....");

	}

	@Override
	public void sendEmailwithAttachment(EmailSender sender) {
		MimeMessage message = mailSender.createMimeMessage();

		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setText(sender.getTextBody());
			helper.setTo(sender.getToEmail());
			helper.setSubject(sender.getSubject());
			helper.setFrom(sender.getFromEmail());

			FileSystemResource resource = new FileSystemResource("E:\\jdbcapi.pdf");
			helper.addAttachment(resource.getFilename(), resource);

			mailSender.send(message);

			System.out.println("send attachement");

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
