package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.model.StudentDocuments;

@Repository
public interface StudentDocumentsRepository extends JpaRepository<StudentDocuments,Integer>
{
}
