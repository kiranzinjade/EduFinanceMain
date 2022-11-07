package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.BasicInformation;

@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation,Integer>
{

	BasicInformation findByBasicInformationId(int basicInformationId);

}
