package com.ketcap.ketcap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketcap.ketcap.model.Teacher;
import com.ketcap.ketcap.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository repository;
	
	public Teacher findBySsn(Long ssn) {
		return repository.findBySsn(ssn);
	}

}
