package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.ParentBankDetails;
import com.webcorestone.EduFinance.app.repository.ParentBankDetailsRepository;
import com.webcorestone.EduFinance.app.service.ParentBankDetailsService;

@Service
public class ParentBankDetailsServiceImpl implements ParentBankDetailsService
{
	@Autowired
	ParentBankDetailsRepository pbdr;

	@Override
	public ParentBankDetails saveParentBank(ParentBankDetails pbd) {
		
		return pbdr.save(pbd);
	}

	@Override
	public List<ParentBankDetails> getAll() {
		
		return pbdr.findAll();
	}

	@Override
	public void deleteData(int parentBankDetailsId) {
		pbdr.deleteById(parentBankDetailsId);
		
	}

	@Override
	public ParentBankDetails update(int parentBankDetailsId) {
		
		return pbdr.findByParentBankDetailsId(parentBankDetailsId);
	}

}
