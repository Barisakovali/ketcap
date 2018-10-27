package com.ketcap.ketcap.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ketcap.ketcap.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	Student findByStudentNumber(Long studentNumber);
	
	List<Student> findAll();
}
