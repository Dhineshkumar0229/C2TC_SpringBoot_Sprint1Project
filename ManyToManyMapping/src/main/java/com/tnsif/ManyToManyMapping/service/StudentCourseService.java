package com.tnsif.ManyToManyMapping.service;

import com.tnsif.ManyToManyMapping.entity.Course;
import com.tnsif.ManyToManyMapping.entity.Student;

public interface StudentCourseService {
    void addStudentToCourse(Student student, Course course);
}