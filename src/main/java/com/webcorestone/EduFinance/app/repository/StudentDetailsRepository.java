package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.StudentDetails;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Integer>
{

	StudentDetails findByStudentDetailsId(int studentDetailsId);

}
