package com.webcorestone.EduFinance.app.controller;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.EduFinance.app.dto.LoginDto;
import com.webcorestone.EduFinance.app.model.Student;
import com.webcorestone.EduFinance.app.service.StudentService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class StudentController 
{
	@Autowired
	private StudentService ss;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/login/{emailId}/{password}")
	public ResponseEntity<LoginDto> login(@PathVariable("emailId") String emailId,@PathVariable("password") String password)
	{
		Student stu=ss.getByEmailAndPassword(emailId,password);
		LoginDto loginDto=modelMapper.map(stu,LoginDto.class);
		return ResponseEntity.ok().body(loginDto);
		
	}
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudentData(@Valid @RequestBody Student stu)
	{
		Student s=ss.saveStudentData(stu);
		return new ResponseEntity<Student>(s, HttpStatus.CREATED);	
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		List<Student> list=ss.getAllStudent();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/getStudent/{firstName}")
	public ResponseEntity<Student> searchStudent(@PathVariable("firstName") String firstName)
	{
		Student st=ss.searchStudent(firstName);
		return new ResponseEntity<Student>(st, HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteStudent/{sid}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("sid") int sid)
	{
		ss.deleteStudent(sid);
		return new ResponseEntity(HttpStatus.NO_CONTENT);	
	}
	
	@PutMapping("/updateStudent/{sid}")
	public ResponseEntity<Student> updateStudent(@PathVariable("sid") int sid,@RequestBody Student stu)
	{
		Student s=ss.updateStudent(sid);
		ss.saveStudentData(stu);
		return new ResponseEntity<Student>(s, HttpStatus.CREATED);
		
	}
}
