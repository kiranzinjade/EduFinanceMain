package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.StudentDetails;

public interface StudentDetailsService {

	StudentDetails save(StudentDetails sd);

	List<StudentDetails> getAll();

	void delete(int studentDetailsId);

	StudentDetails updateData(int studentDetailsId);

}
