package com.subh.studentregi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subh.studentregi.entity.Student;
import com.subh.studentregi.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	private StudentRepository stuRepo;

	@Override
	public void saveStudentData(Student st) {
		stuRepo.save(st);
		
	}

	@Override
	public void getStudentData() {
		
    

		
	}


}
