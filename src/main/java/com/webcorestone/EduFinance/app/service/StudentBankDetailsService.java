package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.StudentBankDetails;

public interface StudentBankDetailsService {

	StudentBankDetails save(StudentBankDetails sbd);

	List<StudentBankDetails> getAll();

	void delete(int stuBankDetailsId);

	StudentBankDetails update(int stuBankDetailsId);

}
