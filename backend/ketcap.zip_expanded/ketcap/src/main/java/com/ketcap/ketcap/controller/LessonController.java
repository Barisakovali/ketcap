package com.ketcap.ketcap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketcap.ketcap.model.Lesson;
import com.ketcap.ketcap.service.LessonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/lesson")
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@GetMapping("/")
	public List<Lesson> getLessons() {
		List<Lesson> lessons = lessonService.findAll();
		return lessons;
	}

}
