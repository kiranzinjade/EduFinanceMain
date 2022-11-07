
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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AdmissionDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "admissionDetailsId is not null")
	private int admissionDetailsId;
	@NotNull(message = "university name is not be null")
	@Size(min = 2,max = 16)
	private String univerSityName;
	@NotNull(message = "college name is not be null")
	@Size(min = 2,max = 16)
	private String collegeName;
	@NotNull(message = "college address is not be null")

	private String collegeAddress;

}
