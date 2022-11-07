package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.model.StudentDocuments;
import com.webcorestone.EduFinance.app.repository.StudentDocumentsRepository;
import com.webcorestone.EduFinance.app.service.StudentDocumentsService;

@Service
public class StudentDocumentsServiceImpl implements StudentDocumentsService {
	@Autowired
	StudentDocumentsRepository sdr;

	@Override
	public StudentDocuments save(StudentDocuments sd) {

		return sdr.save(sd);
	}

	@Override
	public List<StudentDocuments> getDocuments() {

		return sdr.findAll();
	}
}
