package com.crud1.Crud1.services;

import java.util.List;


import com.crud1.Crud1.entities.Course;

public interface CourseService 
{
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long courseId);
}
