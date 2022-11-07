package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.ParentBankDetails;

public interface ParentBankDetailsService {

	ParentBankDetails saveParentBank(ParentBankDetails pbd);

	List<ParentBankDetails> getAll();

	void deleteData(int parentBankDetailsId);

	ParentBankDetails update(int parentBankDetailsId);

}
