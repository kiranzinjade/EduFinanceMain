package com.webcorestone.EduFinance.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.EduFinance.app.modelInformation.BasicInformation;
import com.webcorestone.EduFinance.app.service.BasicInformationService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class BasicInformationController {
	@Autowired
	BasicInformationService bis;

	@PostMapping("/saveBasicInformation")
	public ResponseEntity<BasicInformation> saveBasicInformation(@RequestBody @Valid BasicInformation bi) {
		BasicInformation basic = bis.save(bi);
		return new ResponseEntity<BasicInformation>(basic, HttpStatus.CREATED);
	}
  @GetMapping("/getBasicInformation")
  public ResponseEntity<List<BasicInformation>> getAll()
  {
	  List<BasicInformation> list=bis.getBasicInformation();
	  return new ResponseEntity<List<BasicInformation>>(list,HttpStatus.OK);
  }
  @DeleteMapping("/deleteBasicInformation/{basicInformationId}")
  public ResponseEntity<String> delete(@PathVariable int basicInformationId)
  {
	  bis.deleteBasicInformation(basicInformationId);
	  return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
  }
  @PutMapping("/updateBasicInformation/{basicInformationId}")
  public ResponseEntity<BasicInformation> update(@PathVariable int basicInformationId,@RequestBody BasicInformation bi)
  {
	  
	  BasicInformation updateBasic=bis.updateById(basicInformationId);
	  BasicInformation updated=bis.save(bi);
	  return new ResponseEntity<BasicInformation>(updateBasic,HttpStatus.OK);
  }
}
