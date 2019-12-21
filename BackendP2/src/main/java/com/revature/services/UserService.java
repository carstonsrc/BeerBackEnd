package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	public UserService() {
		super();
	}
	public List<User> getUsers(){
		return userdao.getUsers();
	}
	public User getUserById(int id) {
		return userdao.getUserById(id);
	}
	public int createUser(User user) {
		return userdao.createUser(user);
	}
	public int updateUser(User u) {
		return userdao.updateUser(u);
	}
	public User getUserByUsernameAndPassword(String username, String password) {
		return userdao.getUserByUsernameAndPassword(username,password);
	}
}
