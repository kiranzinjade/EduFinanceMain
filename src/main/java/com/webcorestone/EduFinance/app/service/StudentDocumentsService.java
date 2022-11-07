package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.model.StudentDocuments;

public interface StudentDocumentsService 
{
	StudentDocuments save(StudentDocuments sd);
	List<StudentDocuments> getDocuments();
}
