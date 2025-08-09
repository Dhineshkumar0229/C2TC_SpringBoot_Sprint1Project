package com.tnsif.mallservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.mallservice.entity.Mall;

public interface  MallRepository extends JpaRepository<Mall,String> {



}
