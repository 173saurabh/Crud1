package com.crud1.Crud1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud1.Crud1.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>
{
	
}
