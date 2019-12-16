package com.revature.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.util.HibernateUtil;
import com.revature.model.UserSavedSettings;

public class UserSavedSettingsDaoImpl  implements UserSavedSettingsDao {
	
	private static Logger log = Logger.getRootLogger();

	@Override
	public List<UserSavedSettings> getUserSavedSettings() {
		Session s = HibernateUtil.getSession();
		
		CriteriaBuilder cb = s.getCriteriaBuilder();
		CriteriaQuery<UserSavedSettings> cq = cb.createQuery(UserSavedSettings.class);
		
		Root<UserSavedSettings> root = cq.from(UserSavedSettings.class);
		cq.select(root);
		
		Query<UserSavedSettings> query = s.createQuery(cq);
		List<UserSavedSettings> settings = query.list();
		
		s.close();
		return settings;
	}

	@Override
	public UserSavedSettings getUserSavedSettingsById(int id) {
		UserSavedSettings settings = null;
		try(Session s = HibernateUtil.getSession()){
			settings = s.load(UserSavedSettings.class, id);
			log.info("getting settings: "+ settings);
		}	
		return settings;
	}

	@Override
	public int createUserSavedSettings(UserSavedSettings userSavedSettings) {
		int pk = 0;
		try (Session s = HibernateUtil.getSession();){
		Transaction tx = s.beginTransaction();
		pk = (int) s.save(userSavedSettings);
		tx.commit();
		}
		return pk;
	}

	@Override
	public void updateUserSavedSettings(UserSavedSettings userSavedSettings) {
		try(Session s = HibernateUtil.getSession()){
			Transaction tx = s.beginTransaction();
			s.update(userSavedSettings);
			tx.commit();
		}
		
	}
	
	

}
