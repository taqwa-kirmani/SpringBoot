package com.springrest.springrest.Services;

import java.util.List;
import com.springrest.springrest.entity.Course;

public interface CourseService {
   public List<Course> getAll();
   public Course getOne(long courseId);
   public Course addOne(Course course);
   public Course updateOne(Course course);
   public List<Course> deleteOne(long courseId);
}
