package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.BasicInformation;

public interface BasicInformationService {

	BasicInformation save(BasicInformation bi);

	List<BasicInformation> getBasicInformation();

	void deleteBasicInformation(int basicInformationId);

	BasicInformation updateById(int basicInformationId);

}
