package com.tnsif.spring_data_jpa_mapping.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tnsif.spring_data_jpa_mapping.dto.OrderResponse;
import com.tnsif.spring_data_jpa_mapping.entity.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

   @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}