package com.webcorestone.EduFinance.app.controller;

import java.util.List;

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

import com.webcorestone.EduFinance.app.modelInformation.StudentDetails;
import com.webcorestone.EduFinance.app.service.StudentDetailsService;

@RestController
@CrossOrigin("*")
public class StudentDetailsController 
{
	@Autowired
	StudentDetailsService sds;
	@PostMapping("/saveStudentDetails")
	public ResponseEntity<StudentDetails> save(@RequestBody StudentDetails sd)
	{
		StudentDetails stuSave=sds.save(sd);
		return new ResponseEntity<StudentDetails>(stuSave,HttpStatus.CREATED);
	}
	@GetMapping("/getStudentDetails")
	public ResponseEntity<List<StudentDetails>> getAllData()
	{
		List<StudentDetails> list=sds.getAll();
		return new ResponseEntity<List<StudentDetails>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/deleteStudentDetails/{studentDetailsId}")
	public ResponseEntity<String> delete(@PathVariable int studentDetailsId)
	{
		sds.delete(studentDetailsId);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/updateStudentDetails/{studentDetailsId}")
	public ResponseEntity<StudentDetails> update(@PathVariable int studentDetailsId,@RequestBody StudentDetails sdetails)
	{
		StudentDetails update=sds.updateData(studentDetailsId);
		StudentDetails stuUpdate=sds.save(sdetails);
		return new ResponseEntity<StudentDetails>(update,HttpStatus.OK);
	}
}
