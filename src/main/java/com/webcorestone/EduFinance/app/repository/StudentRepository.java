package com.webcorestone.EduFinance.app.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{

	Student findByFirstName(String firstName);

	Student findBySid(int sid);
	
	Student findByEmailIdAndPassword(String emailId, String password);


}
