package com.tnsif.OneToOneMapping.service;

import java.util.List;

import com.tnsif.OneToOneMapping.entity.User;
import com.tnsif.OneToOneMapping.exception.UserNotFoundException;

public interface UserService {

    // Save a new User
    User saveUser(User user);

    // Get all Users
    List<User> getAllUsers();

    // Get User by ID, declare that it can throw UserNotFoundException
    User getUserById(Long id) throws UserNotFoundException;

    // Update a User by ID, declare that it can throw UserNotFoundException
    User updateUser(Long id, User updatedUser) throws UserNotFoundException;

    // Delete a User by ID, declare that it can throw UserNotFoundException
    boolean deleteUser(Long id) throws UserNotFoundException;
}