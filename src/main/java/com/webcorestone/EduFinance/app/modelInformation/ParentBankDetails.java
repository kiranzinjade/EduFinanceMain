package com.webcorestone.EduFinance.app.modelInformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ParentBankDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "parent bank details id is not null")
	private int parentBankDetailsId;
	@NotNull(message = "ifsc code is not null")
	@Size(max = 11)
	private String ifscCode;
	@NotNull(message = "bank name is not null")
	@Size(min = 2,max = 16)
	private String bankName;
	@NotNull(message = "branch name is not null")
	@Size(min = 2,max = 16)
	private String branch;
	@NotNull(message = "account type is not null")
	@Size(min = 2,max = 10)
	private String accountType;
	@NotNull(message = "account number  is not null")
	@Size(min = 10,max = 15)
	private String accountNo;
	@NotNull(message = "liablity details is not null")
	private String liablityDetails;
	

}
