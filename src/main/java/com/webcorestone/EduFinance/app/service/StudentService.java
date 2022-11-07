package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.model.Student;

public interface StudentService {

	Student saveStudentData(Student stu);

	List<Student> getAllStudent();

	Student searchStudent(String firstName);

	void deleteStudent(int sid);

	Student updateStudent(int sid);

	Student getByEmailAndPassword(String emailId, String password);

	

}
