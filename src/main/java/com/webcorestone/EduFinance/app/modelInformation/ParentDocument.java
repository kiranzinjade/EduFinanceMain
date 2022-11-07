package com.webcorestone.EduFinance.app.modelInformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ParentDocument 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documentId;
	private int parentId;
	@Lob
	private byte[] parentAddhar;
	@Lob
	private byte[] parentPan;
	@Lob
	private byte[] parentPic;
	@Lob
	private byte[] parentSign;
	@Lob
	private byte[] incomeproof;
	@Lob
	private byte[] guranterpic;
	@Lob
	private byte[] guranterpan;
	

}
