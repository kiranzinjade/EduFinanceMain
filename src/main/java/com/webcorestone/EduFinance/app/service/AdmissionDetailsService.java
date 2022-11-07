package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.AdmissionDetails;

public interface AdmissionDetailsService {

	AdmissionDetails saveAdmissionDetails(AdmissionDetails ad);

	List<AdmissionDetails> getAllData();

	void delete(int admissionDetailsId);

	AdmissionDetails updateData(int admissionDetailsId);

}
