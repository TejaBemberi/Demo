package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.Student.Student;
import com.ojas.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;

	public String insertStudent(Student s) {
		String res=dao.addStudent(s);
		return res;
	}
}
