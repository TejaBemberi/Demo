package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojas.Student.Student;
import com.ojas.service.StudentService;

@Controller("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/addstudent",method=RequestMethod.POST)
	public String addStudent(){
		Student s=new Student();
		s.setSno(101);
		s.setSname("Teja");
		s.setSaddr("Wgl");
		service.insertStudent(s);
		return "result";
	}
	
}
