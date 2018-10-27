package com.ketcap.ketcap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketcap.ketcap.model.Student;
import com.ketcap.ketcap.service.StudentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getStudents() {
		List<Student> students = studentService.findAll();
		return students;
	}
	
	@GetMapping("/{studentNumber}")
	public Student getStudent(@PathVariable Long studentNumber) {
		Student student = studentService.findByStudentNumber(studentNumber);
		return student;
	}
}
