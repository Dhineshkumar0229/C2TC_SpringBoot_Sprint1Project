package com.tnsif.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.userservice.repository.UserRepository;
import com.tnsif.userservice.user.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	
	//to get all records
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	//to get particular record
	public User getById(Integer id) {
		return repo.findById(id).get();
	}
	
	//to save record
	public User createUser(User user) {
		return repo.save(user);
	}
	
	//to update the records
	public void updateUser(User user) {
		repo.save(user);
	}
	
	//to delete records
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
}