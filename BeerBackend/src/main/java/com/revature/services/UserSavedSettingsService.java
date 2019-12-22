package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserSavedSettingsDao;
import com.revature.model.UserSavedSettings;

@Service
public class UserSavedSettingsService {
	
	@Autowired
	private UserSavedSettingsDao ussdao;

	public UserSavedSettingsService() {
		super();
	}
	
	public List<UserSavedSettings> getUserSavedSettings(){
		return ussdao.getUserSavedSettings();
	}
	public UserSavedSettings getUserSavedSettingsById(int id) {
		return ussdao.getUserSavedSettingsById(id);
	}
	public int createUserSavedSettings(UserSavedSettings userSavedSettings) {
		return ussdao.createUserSavedSettings(userSavedSettings);
	}
	public int updateUserSavedSettings(UserSavedSettings userSavedSettings) {
		return ussdao.updateUserSavedSettings(userSavedSettings);
	}

}
