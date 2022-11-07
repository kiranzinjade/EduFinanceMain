package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.ParentDetails;

public interface ParentDetailsService {

	ParentDetails save(ParentDetails pd);

	List<ParentDetails> getAll();

	void delete(int parentDetailsId);

	ParentDetails update(int parentDetailsId);

}
