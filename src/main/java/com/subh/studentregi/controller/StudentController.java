package com.subh.studentregi.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subh.studentregi.entity.Student;
import com.subh.studentregi.service.StudentService;

@RestController
@RequestMapping("/registration")
public class StudentController 
{
	@Autowired
	private StudentService stserv;
	
	@PostMapping("/saveData")
	public String saveStudentData(@RequestBody Student st)
	{
		 stserv.saveStudentData(st);
		return "Student data saved";
	}

}
