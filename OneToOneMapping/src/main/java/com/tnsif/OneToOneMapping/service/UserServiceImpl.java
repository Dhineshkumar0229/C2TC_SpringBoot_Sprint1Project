package com.tnsif.OneToOneMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.OneToOneMapping.entity.User;
import com.tnsif.OneToOneMapping.exception.UserNotFoundException;
import com.tnsif.OneToOneMapping.repostiory.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Save a new User
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get all Users
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by ID
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> 
            new UserNotFoundException("User with ID " + id + " not found")
        );
    }

    // Update a User by ID
    @Override
    public User updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> 
            new UserNotFoundException("User with ID " + id + " not found")
        );

        // Update basic fields
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPhoneNumber(updatedUser.getPhoneNumber());

        // Other logic for updating profile...
        
        return userRepository.save(existingUser);
    }

    // Delete a User by ID
    @Override
    public boolean deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException("User with ID " + id + " not found");
        }
        userRepository.deleteById(id);
        return true;
    }
}
