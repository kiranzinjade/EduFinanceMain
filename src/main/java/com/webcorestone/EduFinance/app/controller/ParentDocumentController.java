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
import com.webcorestone.EduFinance.app.modelInformation.ParentDocument;
import com.webcorestone.EduFinance.app.service.ParentDocService;


@RestController
@CrossOrigin("*")
public class ParentDocumentController 
{
	@Autowired
	ParentDocService pdocservice;
	
	@RequestMapping(value="/parentdocupload",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ParentDocument parentdocsave(@RequestPart(required = true,value="parentAddhar")MultipartFile f1,
			@RequestPart(required = true,value="parentPan")MultipartFile f2,
			@RequestPart(required = true,value="parentPic")MultipartFile f3,
			@RequestPart(required = true,value="parentSign")MultipartFile f4,
			@RequestPart(required = true,value="incomeproof")MultipartFile f5,
			@RequestPart(required = true,value="guranterpic")MultipartFile f6,
			@RequestPart(required = true,value="guranterpan")MultipartFile f7,
			@RequestPart("doc") String doc) throws IOException
	{
		
		
		ParentDocument pdoc=new ParentDocument();
		
		pdoc.setParentAddhar(f1.getBytes());
		pdoc.setParentPan(f2.getBytes());
		pdoc.setParentPic(f3.getBytes());
		pdoc.setParentSign(f4.getBytes());
		pdoc.setIncomeproof(f5.getBytes());
		pdoc.setGuranterpic(f6.getBytes());
		pdoc.setGuranterpan(f7.getBytes());
		
		Gson gson=new Gson();
		
		ParentDocument pd=gson.fromJson(doc, ParentDocument.class);
		
		pdoc.setDocumentId(pd.getDocumentId());
		pdoc.setParentId(pd.getParentId());
		
		
		ParentDocument pdoclist=pdocservice.saveParentDoc(pdoc);
		return pdoclist;
		
	}
	
	@GetMapping(value = "/getparentdoc")
	public List<ParentDocument> getdoc()
	{
		return pdocservice.getParentDoc();
		
	}

}

