package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.StudentBankDetails;
import com.webcorestone.EduFinance.app.repository.StudentBankDetailsRepository;
import com.webcorestone.EduFinance.app.service.StudentBankDetailsService;

@Service
public class StudentBankDetailsServiceImpl implements StudentBankDetailsService
{
	@Autowired
	StudentBankDetailsRepository sbdr;

	@Override
	public StudentBankDetails save(StudentBankDetails sbd) {
		
		return sbdr.save(sbd);
	}

	@Override
	public List<StudentBankDetails> getAll() {
		// TODO Auto-generated method stub
		return sbdr.findAll();
	}

	@Override
	public void delete(int stuBankDetailsId) {
		// TODO Auto-generated method stub
		 sbdr.deleteById(stuBankDetailsId);;
	}

	@Override
	public StudentBankDetails update(int stuBankDetailsId) {
		
		return sbdr.findByStuBankDetailsId(stuBankDetailsId);
	}

}
