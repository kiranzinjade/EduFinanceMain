package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.BasicInformation;
import com.webcorestone.EduFinance.app.repository.BasicInformationRepository;
import com.webcorestone.EduFinance.app.service.BasicInformationService;

@Service
public class BasicInformationServiceImpl implements BasicInformationService
{
	@Autowired
	BasicInformationRepository bir;

	@Override
	public BasicInformation save(BasicInformation bi) {
		
		return bir.save(bi);
	}

	@Override
	public List<BasicInformation> getBasicInformation() {
		// TODO Auto-generated method stub
		return bir.findAll();
	}

	@Override
	public void deleteBasicInformation(int basicInformationId) {
		// TODO Auto-generated method stub
		bir.deleteById(basicInformationId);
	}

	@Override
	public BasicInformation updateById(int basicInformationId) {
		// TODO Auto-generated method stub
		return bir.findByBasicInformationId(basicInformationId);
	}

}
