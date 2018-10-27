package com.ketcap.ketcap.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ketcap.ketcap.model.Lesson;

public interface LessonRepository extends CrudRepository<Lesson, Long>{

	List<Lesson> findAll();
	
}
