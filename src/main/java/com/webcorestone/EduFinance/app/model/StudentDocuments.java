package com.webcorestone.EduFinance.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class StudentDocuments 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	@NotNull(message = "student id is not null")
	private int studentId;
//	@NotNull(message = "student name is not null")
//	@Size(min = 2,max = 16)
//	private String studentName;
	@Lob
	private byte[] admissionIdProof;
	@Lob
	private byte[] marksheet;
	@Lob
	private byte[] feeStructure;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] aadharCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signiture;
	
	

}
