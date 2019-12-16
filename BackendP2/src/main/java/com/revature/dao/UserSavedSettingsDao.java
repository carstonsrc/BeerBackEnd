package com.revature.dao;

import java.util.List;
import com.revature.model.UserSavedSettings;

public interface UserSavedSettingsDao {
	
	public List<UserSavedSettings> getUserSavedSettings();
	public UserSavedSettings getUserSavedSettingsById(int id);
	public int createUserSavedSettings(UserSavedSettings userSavedSettings);
	public void updateUserSavedSettings(UserSavedSettings userSavedSettings);
	
}
