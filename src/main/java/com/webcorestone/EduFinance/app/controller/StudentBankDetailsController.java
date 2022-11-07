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

import com.webcorestone.EduFinance.app.modelInformation.StudentBankDetails;
import com.webcorestone.EduFinance.app.service.StudentBankDetailsService;

@RestController
@CrossOrigin("*")
public class StudentBankDetailsController 
{
	@Autowired
	StudentBankDetailsService sbds;
  @PostMapping("/saveStudentBankDetails")
  public ResponseEntity<StudentBankDetails> save(@RequestBody @Valid StudentBankDetails sbd)
  {
	  StudentBankDetails stuBank=sbds.save(sbd);
	  return new ResponseEntity<StudentBankDetails>(stuBank,HttpStatus.CREATED);
  }
  @GetMapping("/getStudentBankDetails")
  public ResponseEntity<List<StudentBankDetails>> getAllData()
  {
	  List<StudentBankDetails> listStuBank=sbds.getAll();
	  return new ResponseEntity<List<StudentBankDetails>>(listStuBank, HttpStatus.OK);
  }
  @DeleteMapping("/deleteStudentBank/{stuBankDetailsId}")
  public ResponseEntity<String> delete(@PathVariable int stuBankDetailsId)
  {
	   sbds.delete(stuBankDetailsId);
	  return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
  }
  @PutMapping("/updateStudentBankDetails/{stuBankDetailsId}")
  public ResponseEntity<StudentBankDetails> update(@PathVariable int stuBankDetailsId,@RequestBody StudentBankDetails sbd)
  {
	 StudentBankDetails updateId=sbds.update(stuBankDetailsId);
	 StudentBankDetails stuUpdate=sbds.save(sbd);
	 return new ResponseEntity<StudentBankDetails>(updateId,HttpStatus.OK);
  }
}
