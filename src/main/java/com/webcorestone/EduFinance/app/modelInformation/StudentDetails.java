package com.webcorestone.EduFinance.app.modelInformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class StudentDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "student details id is not null")
	private int studentDetailsId;
	@NotNull(message = "first name is not null")
	@Size(min = 2,max = 16)
	private String firstName;
	@NotNull(message = "last name is not null")
	@Size(min = 2,max = 16)
	private String lastName;
	@NotNull(message = "date of birth is not null")
	
	private String dateOfBirth;
	@NotNull(message = "sex is not null")
	@Size(min = 2,max = 6)
	private String sex;
	@NotNull(message = "marks is not null")
	@Size(min = 2,max = 5)
	private String marksObtained;
	@NotNull(message = "address is not null")
	private String address;
	@NotNull(message = "pan number is not null")
	@Size(min = 10,max = 10)
	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
	private String panNo;
	@NotNull(message = "mobile number is not null")
	@Size(min = 10,max = 10)
	@Pattern(regexp = "[0-9]{10}")
	private String mobNo;
	@Email
	private String emailId;

}
