package com.tnsif.ManyToManyMapping.service;

import org.springframework.stereotype.Service;

import com.tnsif.ManyToManyMapping.entity.Course;
import com.tnsif.ManyToManyMapping.entity.Student;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {
    @Override
    public void addStudentToCourse(Student student, Course course) {
        // Add the student to the course
        course.getStudents().add(student);
        student.getCourses().add(course);
    }
}
