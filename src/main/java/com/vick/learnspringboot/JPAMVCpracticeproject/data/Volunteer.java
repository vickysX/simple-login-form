package com.vick.learnspringboot.JPAMVCpracticeproject.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ragazz")
public class Volunteer {
	@Id
	private long id;
	
	private String name;
	
	private String surname;
	
	private String password;
	
	@ManyToOne
	private Project project;
	
	public Volunteer() {
		
	}

	public Volunteer(long id, String name, String surname, String password, Project project) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.project = project;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Volunteer [id=" + id + ", name=" + name + ", surname=" + surname + ", project=" + project + "]";
	}
	
	
	
	
}
