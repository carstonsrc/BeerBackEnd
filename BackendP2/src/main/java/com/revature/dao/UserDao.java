package com.revature.dao;

import java.util.List;

import com.revature.model.User;

public interface UserDao {
	
	public List<User> getUsers();
	public User getUserById(int id);
	public int createUser(User user);
	public int updateUser(User u);
	public User getUserByUsernameAndPassword(String username, String password);

}
