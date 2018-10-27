package com.ketcap.ketcap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketcap.ketcap.model.Teacher;
import com.ketcap.ketcap.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/{ssn}")
	public Teacher getStudent(@PathVariable Long ssn) {
		Teacher teacher = teacherService.findBySsn(ssn);
		return teacher;
	}
	
}
