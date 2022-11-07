package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.exception.StudentNotFoundException;
import com.webcorestone.EduFinance.app.model.Student;
import com.webcorestone.EduFinance.app.repository.StudentRepository;
import com.webcorestone.EduFinance.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository sr;
	@Override
	public Student saveStudentData(Student stu) 
	{
		return sr.save(stu);
	}
	@Override
	public List<Student> getAllStudent() {
		List<Student> list=(List<Student>) sr.findAll();
		if(list!=null)
		{
			return list;
		}
		else
		{
			throw new StudentNotFoundException("student is not found");
		}
	}
	@Override
	public Student searchStudent(String firstName)
	{
		Student student=sr.findByFirstName(firstName);
		if(student!=null)
		{
			return student;
		}
		else
		{
			throw new StudentNotFoundException("student is not found");
		}
	}
	@Override
	public void deleteStudent(int sid) {
		sr.deleteById(sid);
	}
	@Override
	public Student updateStudent(int sid) {
		
		return sr.findBySid(sid);
	}
	@Override
	public Student getByEmailAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		return sr.findByEmailIdAndPassword(emailId, password);
	}
	


}
