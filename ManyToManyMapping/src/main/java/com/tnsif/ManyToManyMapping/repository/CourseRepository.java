package com.tnsif.ManyToManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ManyToManyMapping.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
}