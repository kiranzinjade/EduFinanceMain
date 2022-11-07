package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.StudentDetails;
import com.webcorestone.EduFinance.app.repository.StudentDetailsRepository;
import com.webcorestone.EduFinance.app.service.StudentDetailsService;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService
{
	@Autowired
	StudentDetailsRepository sdr;

	@Override
	public StudentDetails save(StudentDetails sd) {
		
		return sdr.save(sd);
	}

	@Override
	public List<StudentDetails> getAll() {
		
		return sdr.findAll();
	}

	@Override
	public void delete(int studentDetailsId) {
		sdr.deleteById(studentDetailsId);
		
	}

	@Override
	public StudentDetails updateData(int studentDetailsId) {
		
		return sdr.findByStudentDetailsId(studentDetailsId);
	}

}
