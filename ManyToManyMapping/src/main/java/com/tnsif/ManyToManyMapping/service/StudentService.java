package com.tnsif.ManyToManyMapping.service;


import java.util.List;

import com.tnsif.ManyToManyMapping.entity.Student;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
