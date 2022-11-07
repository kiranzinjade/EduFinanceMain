package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.ParentDetails;
import com.webcorestone.EduFinance.app.repository.ParentDetailsRepository;
import com.webcorestone.EduFinance.app.service.ParentDetailsService;

@Service
public class ParentDetailsServiceImpl implements ParentDetailsService
{
	@Autowired
	ParentDetailsRepository pdr;

	@Override
	public ParentDetails save(ParentDetails pd) {
		
		return pdr.save(pd);
	}

	@Override
	public List<ParentDetails> getAll() {
		
		return pdr.findAll();
	}

	@Override
	public void delete(int parentDetailsId) {
		pdr.deleteById(parentDetailsId);
	}

	@Override
	public ParentDetails update(int parentDetailsId) {
		
		return pdr.findByParentDetailsId(parentDetailsId);
	}

}
