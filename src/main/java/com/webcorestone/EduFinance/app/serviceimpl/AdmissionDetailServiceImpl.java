package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.AdmissionDetails;
import com.webcorestone.EduFinance.app.repository.AdmissionDetailRepository;
import com.webcorestone.EduFinance.app.service.AdmissionDetailsService;

@Service
public class AdmissionDetailServiceImpl implements AdmissionDetailsService
{
	@Autowired
	private AdmissionDetailRepository admissionDetailRepository;

	@Override
	public AdmissionDetails saveAdmissionDetails(AdmissionDetails ad) {
		
		return admissionDetailRepository.save(ad);
	}

	@Override
	public List<AdmissionDetails> getAllData() {
		
		return (List<AdmissionDetails>) admissionDetailRepository.findAll();
	}

	@Override
	public void delete(int admissionDetailsId) {
		admissionDetailRepository.deleteById(admissionDetailsId);
		
	}

	@Override
	public AdmissionDetails updateData(int admissionDetailsId) {
		
		return admissionDetailRepository.findByAdmissionDetailsId(admissionDetailsId);
	}
	
}
