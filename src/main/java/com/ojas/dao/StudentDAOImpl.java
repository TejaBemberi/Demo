package com.ojas.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ojas.Student.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	HibernateTemplate ht;
	
	public String addStudent(Student s) {
		String res=(String) ht.save(s);
		return res;
	}

}
