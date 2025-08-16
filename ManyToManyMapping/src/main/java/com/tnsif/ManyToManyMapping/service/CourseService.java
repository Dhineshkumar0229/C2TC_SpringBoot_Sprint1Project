package com.tnsif.ManyToManyMapping.service;

import java.util.List;

import com.tnsif.ManyToManyMapping.entity.Course;

public interface CourseService {
    Course saveCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}
