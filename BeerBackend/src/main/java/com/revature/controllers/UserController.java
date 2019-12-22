package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.services.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService us;
	
	@PostMapping("/users/create")
	public int createUser(@RequestBody User user) {
		
		return us.createUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		
		return us.getUsers();
	}
	
	@PostMapping("/users/update")
	public int updateUser(@RequestBody User u) {
		
		return us.updateUser(u);
	}
	
	@GetMapping("/users/id")
	public User getUserById(@RequestBody int id) {
		
		return us.getUserById(id);
	}

}
