package com.ketcap.ketcap.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {

	@Id
	@Access(AccessType.PROPERTY)
	private Long studentNumber;
	
	@JsonIgnore
	@NotNull
	@Size(min=6)
	private String password;
	
	@Access(AccessType.PROPERTY)
	@NotNull
	private String firstName;
	
	@Access(AccessType.PROPERTY)
	@NotNull
	private String lastName;
	
	@ManyToOne
	private Parent parent;
	
	@ManyToOne
	private Teacher teacher;
	
	public Student() {
		super();
	}
	
	public Student(Long studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}

	public Long getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Long studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
