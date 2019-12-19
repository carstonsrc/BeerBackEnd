package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService us;
	
	@PostMapping
	public int createUser(@RequestBody User user) {
		
		return us.createUser(user);
	}
	
	@GetMapping
	public List<User> getUsers() {
		
		return us.getUsers();
	}
	
	@PostMapping
	public int updateUser(@RequestBody User u) {
		
		return us.updateUser(u);
	}
	
	@GetMapping
	public User getUserById(@RequestBody int id) {
		
		return us.getUserById(id);
	}

}
