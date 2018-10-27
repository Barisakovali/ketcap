package com.ketcap.ketcap.model;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Lesson {

	@Id
	@Access(AccessType.PROPERTY)
	private Long id;

	@NotNull
	private String name;
	
	@ManyToMany
	private Set<Student> student;
	
	public Lesson() {
		
	}

	public Lesson(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
