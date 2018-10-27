package com.ketcap.ketcap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketcap.ketcap.model.Student;
import com.ketcap.ketcap.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public Student findByStudentNumber(Long studentNumber) {
		return repository.findByStudentNumber(studentNumber);
	}
	
	public List<Student> findAll() {
		return repository.findAll();
	}

}
