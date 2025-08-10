package com.tnsif.userservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tnsif.userservice.service.UserService;
import com.tnsif.userservice.user.User;

import jakarta.persistence.NoResultException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/userservice")
	public List<User> getAll(){
		return service.getAllUsers();
	}
	
	@GetMapping("/userservice/{id}")
	public ResponseEntity<User> getById(@PathVariable Integer id) {
		try {
			User ad = service.getById(id);
			return new ResponseEntity<User>(ad,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
		
	@PostMapping("/userservice")
	public void save(@RequestBody User ad) {
		service.createUser(ad);
	}
	
	@PutMapping("/userservice/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User update_a) {
		try {
			User user = service.getById(id);

			user.setUsername(update_a.getUsername());
			user.setPass(update_a.getPass());
			user.setEmail(update_a.getEmail());
			user.setRole(update_a.getRole());
			user.setAddress(update_a.getAddress());
			service.updateUser(user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}catch(NoResultException e){
			return new ResponseEntity<User>(HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/adminservice/{id}")
	public void delete(@PathVariable Integer id) {
		service.deleteUser(id);
	}
}
