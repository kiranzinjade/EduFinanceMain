package com.webcorestone.EduFinance.app.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.webcorestone.EduFinance.app.model.StudentDocuments;
import com.webcorestone.EduFinance.app.service.StudentDocumentsService;

@RestController
@CrossOrigin("*")
public class StudentDocumentsController 
{
	@Autowired
	StudentDocumentsService sds;
	
	@RequestMapping(value="/studentDocuments",method =RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public StudentDocuments docSave(@RequestPart (required = true,value="admissionIdProof")MultipartFile f1,
			@RequestPart(required = true,value="marksheet")MultipartFile f2,
			@RequestPart(required = true,value="feeStructure")MultipartFile f3,
			@RequestPart(required = true,value="panCard")MultipartFile f4,
			@RequestPart(required = true,value="aadharCard")MultipartFile f5,
			@RequestPart(required = true,value="photo")MultipartFile f6,
			@RequestPart(required = true,value="signiture")MultipartFile f7,
			@RequestPart("doc") String doc) throws IOException
	{
		StudentDocuments sd=new StudentDocuments();
		sd.setAdmissionIdProof(f1.getBytes());
		sd.setMarksheet(f2.getBytes());
		sd.setFeeStructure(f3.getBytes());
		sd.setPanCard(f4.getBytes());
		sd.setAadharCard(f5.getBytes());
		sd.setPhoto(f6.getBytes());
		sd.setSigniture(f7.getBytes());
		Gson g=new Gson();
		StudentDocuments ds=g.fromJson(doc, StudentDocuments.class);
		sd.setStudentId(ds.getStudentId());
		
		StudentDocuments dsl=sds.save(sd);
		return dsl;
	}
	@GetMapping("/getStudentDocuments")
	public List<StudentDocuments> get()
	{
		return sds.getDocuments();
	}

}
