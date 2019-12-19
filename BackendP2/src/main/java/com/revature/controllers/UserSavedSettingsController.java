package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.UserSavedSettings;
import com.revature.services.UserSavedSettingsService;

@RestController
@RequestMapping("/usersavedsettings")
public class UserSavedSettingsController {

	@Autowired
	private UserSavedSettingsService usss;
	
	@GetMapping
	public List<UserSavedSettings> getUserSavedSettings(){
		
		return usss.getUserSavedSettings();
	}
	
	@GetMapping
	public UserSavedSettings getUserSavedSettingsById(@RequestBody int id) {
		
		return usss.getUserSavedSettingsById(id);
	}
	
	@PostMapping
	public int createUserSavedSettings(@RequestBody UserSavedSettings userSavedSettings) {
		
		return usss.createUserSavedSettings(userSavedSettings);
	}
	@PostMapping
	public int updateUserSavedSettings(@RequestBody UserSavedSettings userSavedSettings) {
		
		return usss.updateUserSavedSettings(userSavedSettings);
		
	}
	

	
}
