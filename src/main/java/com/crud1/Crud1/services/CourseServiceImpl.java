package com.crud1.Crud1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud1.Crud1.dao.CourseDao;
import com.crud1.Crud1.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	//List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Course(1,"Core Java","This course contains basics OOP concepts"));
//		list.add(new Course(2,"Advanced Java","This course conatins Advanced Java concept"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		//return list;
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId)
	{
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setCourses(course.getCourses());
//				e.setDescription(course.getDescription());
//			}
//		}
//		);
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long courseId) 
	{
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		courseDao.deleteById(courseId);
	}
	
}
