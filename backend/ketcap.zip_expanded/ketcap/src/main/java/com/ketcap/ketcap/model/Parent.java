package com.ketcap.ketcap.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Parent {

	@Id
	@Access(AccessType.PROPERTY)
	private Long ssn;

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
	
	public Parent() {
		super();
	}
	
	public Parent(Long ssn) {
		super();
		this.ssn = ssn;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
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

}
