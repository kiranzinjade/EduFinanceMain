package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.AdmissionDetails;
@Repository
public interface AdmissionDetailRepository extends CrudRepository<AdmissionDetails, Integer>
{

	AdmissionDetails findByAdmissionDetailsId(int admissionDetailsId);
	
}
