package com.webcorestone.EduFinance.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "Sid not be null")
	private int sid;
	@NotNull(message = "Title not be null")
	private String title;
	@NotNull(message = "Firstname not be null")
	@Size(min = 2,max = 16)
	private String firstName;
	@NotNull(message = "middlename not be null")
	@Size(min = 2,max = 16)
	private String middleName;
	@NotNull(message = "Lastname not be null")
	@Size(min = 2,max = 16)
	private String lastName;
	@NotNull(message = "Mobile Number not be null")
	//@Max()
	private String mobNo;
	@NotNull(message = "Email not be null")
	@Email
	private String emailId;
	@NotNull(message = "Password not be null")
	private String password;
	@NotNull(message = "confirmPassword not be null")
	private String confirmPassword;
}
