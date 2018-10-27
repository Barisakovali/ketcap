package com.ketcap.ketcap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketcap.ketcap.model.Parent;
import com.ketcap.ketcap.service.ParentService;

@RestController
@RequestMapping("/parent")
public class ParentController {

	@Autowired
	private ParentService parentService;
	
	@GetMapping("/{ssn}")
	public Parent getParent(@PathVariable Long ssn) {
		Parent parent = parentService.findBySsn(ssn);
		return parent;
	}
	
}
