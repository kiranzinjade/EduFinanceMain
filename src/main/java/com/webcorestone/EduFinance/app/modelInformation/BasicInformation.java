package com.webcorestone.EduFinance.app.modelInformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BasicInformation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message=" basicInformationId is not null")
	private int basicInformationId;
  private boolean higherStudies;
  
  @NotEmpty(message = "income is not null")
  @Size(min = 6,max = 10)
  private double parentincome;
  private boolean admission;
  
}
