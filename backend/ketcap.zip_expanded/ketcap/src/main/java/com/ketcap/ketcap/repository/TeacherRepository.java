package com.ketcap.ketcap.repository;

import org.springframework.data.repository.CrudRepository;

import com.ketcap.ketcap.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long>{

	Teacher findBySsn(Long ssn);
}
