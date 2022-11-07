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

import com.webcorestone.EduFinance.app.modelInformation.ParentBankDetails;
import com.webcorestone.EduFinance.app.service.ParentBankDetailsService;

@RestController
@CrossOrigin("*")
public class ParentBankDetailsController
{
	@Autowired
	ParentBankDetailsService pbds;
	@PostMapping("/saveParentBankDetails")
    public ResponseEntity<ParentBankDetails> saveParentBankDetails(@RequestBody ParentBankDetails pbd)
    {
		ParentBankDetails pbankDetails=pbds.saveParentBank(pbd);
		return new ResponseEntity<ParentBankDetails>(pbankDetails, HttpStatus.CREATED);
    }
	@GetMapping("/getParentBankDetails")
	public ResponseEntity<List<ParentBankDetails>> getAll()
	{
		List<ParentBankDetails> list=pbds.getAll();
		return new ResponseEntity<List<ParentBankDetails>>(list, HttpStatus.OK);
	}
	@DeleteMapping("/deleteParentBankDetails/{parentBankDetailsId}")
	public ResponseEntity<String> deleteData(@PathVariable int parentBankDetailsId)
	{
		pbds.deleteData(parentBankDetailsId);
		return new ResponseEntity<String>("delete data successfully",HttpStatus.NO_CONTENT);
	}
	@PutMapping("/updateParentBankDetails/{parentBankDetailsId}")
	public ResponseEntity<ParentBankDetails> update(@PathVariable int parentBankDetailsId,@RequestBody ParentBankDetails parentBank)
	{
		ParentBankDetails update=pbds.update(parentBankDetailsId);
		ParentBankDetails pbupdate=pbds.saveParentBank(parentBank);
		return new ResponseEntity<ParentBankDetails>(update, HttpStatus.OK);
	}
	
}
