package com.tnsif.ManyToManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ManyToManyMapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
