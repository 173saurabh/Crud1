package com.crud1.Crud1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
	public long id;
	public String courses;
	public String description;
	public Course(long id, String courses, String description) {
		super();
		this.id = id;
		this.courses = courses;
		this.description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courses=" + courses + ", description=" + description + "]";
	}
	
	
}
