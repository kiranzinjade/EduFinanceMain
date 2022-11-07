package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.ParentBankDetails;

@Repository
public interface ParentBankDetailsRepository extends JpaRepository<ParentBankDetails,Integer>
{

	ParentBankDetails findByParentBankDetailsId(int parentBankDetailsId);

}
