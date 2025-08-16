package com.tnsif.OneToManyMapping.service;

import java.util.List;

import com.tnsif.OneToManyMapping.entity.Order;
import com.tnsif.OneToManyMapping.exception.OrderNotFoundException;

public interface OrderService {

    // Save a new order
    Order saveOrder(Order order);

    // Get all orders
    List<Order> getAllOrders();

    // Get order by ID
    Order getOrderById(Long id) throws OrderNotFoundException; // Declare the exception

    // Update order by ID
    Order updateOrder(Long id, Order updatedOrder) throws OrderNotFoundException; // Declare the exception

    // Delete order by ID
    boolean deleteOrder(Long id) throws OrderNotFoundException; // Declare the exception
}
