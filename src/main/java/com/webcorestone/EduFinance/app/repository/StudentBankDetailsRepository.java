package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.StudentBankDetails;

@Repository
public interface StudentBankDetailsRepository extends JpaRepository<StudentBankDetails,Integer>
{

	StudentBankDetails findByStuBankDetailsId(int stuBankDetailsId);

}
