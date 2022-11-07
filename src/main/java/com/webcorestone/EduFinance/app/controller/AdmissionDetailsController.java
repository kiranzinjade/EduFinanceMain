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

import com.webcorestone.EduFinance.app.modelInformation.AdmissionDetails;
import com.webcorestone.EduFinance.app.service.AdmissionDetailsService;

@RestController
@CrossOrigin("*")
public class AdmissionDetailsController
{
	@Autowired
	private AdmissionDetailsService admissionService;
	
	@PostMapping("/saveAdmissionDetails")
	public ResponseEntity<AdmissionDetails> saveAdmissionDetails(@RequestBody AdmissionDetails ad)
	{
		AdmissionDetails ads=admissionService.saveAdmissionDetails(ad);
		return new ResponseEntity<AdmissionDetails>(ads, HttpStatus.CREATED);	
	}
	@GetMapping("/getAdmissionDetails")
	public ResponseEntity<List<AdmissionDetails>> getAllDetails()
	{
		List<AdmissionDetails> list=admissionService.getAllData();
		return new ResponseEntity<List<AdmissionDetails>>(list, HttpStatus.OK);
	}
	@DeleteMapping("/deleteAdmission/{admissionDetailsId}")
	public ResponseEntity<String> delete(@PathVariable("admissionDetailsId") int admissionDetailsId)
	{
		admissionService.delete(admissionDetailsId);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/updateAdmissionDetails/{admissionDetailsId}")
	public ResponseEntity<AdmissionDetails> updatedata(@PathVariable int admissionDetailsId,@RequestBody AdmissionDetails admi )
	{
		AdmissionDetails update=admissionService.updateData(admissionDetailsId);
		AdmissionDetails saveUpdate=admissionService.saveAdmissionDetails(admi);
		return new ResponseEntity<AdmissionDetails>(update,HttpStatus.OK);
	}
}
