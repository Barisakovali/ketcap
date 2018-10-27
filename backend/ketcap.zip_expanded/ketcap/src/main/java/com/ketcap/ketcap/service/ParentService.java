package com.ketcap.ketcap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ketcap.ketcap.model.Parent;
import com.ketcap.ketcap.repository.ParentRepository;

@Service
public class ParentService {
	
	@Autowired
	private ParentRepository repository;
	
	public Parent findBySsn(Long ssn) {
		return repository.findBySsn(ssn);
	}

}
