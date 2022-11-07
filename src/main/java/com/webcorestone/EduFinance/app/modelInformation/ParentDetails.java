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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ParentDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@NotNull(message = "parent details id is not null")
	private int parentDetailsId;
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
	@NotNull(message = "occupation is not null")
	@Size(min = 2,max = 10)
	private String occupation;
	@NotNull(message = "income is not null")
	@Size(min = 6,max = 10)

	private String income;
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
	@NotNull(message = "address is not null")
     private String address;


}
