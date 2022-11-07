package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.ParentDetails;

@Repository
public interface ParentDetailsRepository extends JpaRepository<ParentDetails,Integer>
{

	ParentDetails findByParentDetailsId(int parentDetailsId);

}
