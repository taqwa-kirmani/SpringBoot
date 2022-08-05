package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Services.CourseService;
import com.springrest.springrest.entity.Course;



@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
      public String home() {  
    	  return "This is home page";
      }
	
	//get all courses
	@GetMapping("/courses")
	public List<Course> getAll() {
		return this.courseService.getAll();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getOne(@PathVariable long courseId){
		return this.courseService.getOne(courseId);
	}
	
	@PostMapping("/courses")
	public Course addOne(@RequestBody Course course){
		return this.courseService.addOne(course);
	}
	
	@PutMapping("/courses")
	public Course updateOne(@RequestBody Course course){
		return this.courseService.updateOne(course);
	}
	@DeleteMapping("/courses/{courseId}")
	public List<Course> deleteOne(@PathVariable long courseId){
		return this.courseService.deleteOne(courseId);
	}
}
