package com.springrest.springrest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
      list.add(new Course(1,"Java Beginners","This course is the first step you need to take to learn java programming."));
      list.add(new Course(2,"Java Intermediate","This course is the second step you need to take to learn java programming."));
      list.add(new Course(3,"Java Advance","This course is the third step you need to take to learn java programming."));
	}
	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getOne(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course: list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addOne(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	@Override
	public Course updateOne(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	@Override
	public List<Course> deleteOne(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course: list) {
			if(course.getId()==courseId) {
				list.remove(course);
				break;
			}
		}
		return list;
	}

}
