package com.springrest.fullstack_crud.controller;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.springrest.fullstack_crud.model.User;

import com.springrest.fullstack_crud.servicxe.UserService;


@RestController
@CrossOrigin("http://localhost:3002")
public class Controller {
	@Autowired
	private UserService userservice;
	

		
	
	@GetMapping("/users")
	 public List<User> getuser(){
		return userservice.getUser();                 
	
		

		
		
		
		 
	 }
	@GetMapping("/user/{id}")
	public User getUserId(@PathVariable Long id) {
		return this.userservice.getUserId(id);
		
	}
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);
		
		
	}
	@PutMapping("/user/{id}")
	public User updateUsers(@RequestBody User newuser, @PathVariable Long id) {
		return this.userservice.updateUsers(newuser,id);
		
	}
	@DeleteMapping("/user/{id}")
	String deleteUser(@PathVariable Long id) {
		return userservice.deleteuser(id);
		 
		
		
		
		
	}
	
	
	


}
