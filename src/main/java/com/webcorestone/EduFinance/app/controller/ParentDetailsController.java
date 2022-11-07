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

import com.webcorestone.EduFinance.app.modelInformation.ParentDetails;
import com.webcorestone.EduFinance.app.service.ParentDetailsService;

@RestController
@CrossOrigin("*")
public class ParentDetailsController 
{
	@Autowired
	ParentDetailsService pds;
	@PostMapping("/saveParentDetails")
	public ResponseEntity<ParentDetails> save(@RequestBody @Valid ParentDetails pd)
	{
		ParentDetails paDetails=pds.save(pd);
		return new ResponseEntity<ParentDetails>(paDetails,HttpStatus.CREATED);
	}
	@GetMapping("/getParentDetails")
	public ResponseEntity<List<ParentDetails>> getAll()
	{
		List<ParentDetails> list=pds.getAll();
		return new ResponseEntity<List<ParentDetails>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/deleteParentDetails/{parentDetailsId}")
	public ResponseEntity<String> deleteData(@PathVariable int parentDetailsId)
	{
		pds.delete(parentDetailsId);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
     @PutMapping("/updateParentDetails/{parentDetailsId}")
     public ResponseEntity<ParentDetails> update(@PathVariable("parentDetailsId") int parentDetailsId,@RequestBody ParentDetails parDetails)
     {
    	 ParentDetails update=pds.update(parentDetailsId);
    	 ParentDetails upa=pds.save(parDetails);
    	 return new ResponseEntity<ParentDetails>(update,HttpStatus.OK);
     }
}
