package com.ketcap.ketcap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketcap.ketcap.model.Lesson;
import com.ketcap.ketcap.repository.LessonRepository;

@Service
public class LessonService {

	@Autowired
	private LessonRepository repository;
	
	public List<Lesson> findAll() {
		return repository.findAll();
	}
	
}
