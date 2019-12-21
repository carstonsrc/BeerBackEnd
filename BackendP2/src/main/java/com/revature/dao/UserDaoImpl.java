package com.revature.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import org.apache.log4j.Logger;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.User;
import com.revature.util.HibernateUtil;

@Repository
public class UserDaoImpl implements UserDao {

	
	private static Logger log = Logger.getRootLogger();
	
	@Override
	public List<User> getUsers() {
		Session s = HibernateUtil.getSession();
		
		CriteriaBuilder cb = s.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		
		Root<User> root = cq.from(User.class);
		cq.select(root);
		
		Query<User> query = s.createQuery(cq);
		List<User> users = query.list();
		
		s.close();
		return users;
	}

	@Override
	public User getUserById(int id) {
		User u = null;
		try(Session s = HibernateUtil.getSession()){
			u = s.load(User.class, id);
			log.info("getting user: "+ u);
		}	
		return u;
	}

	@Override
	public int createUser(User user) {
		int pk = 0;
		try (Session s = HibernateUtil.getSession();){
		Transaction tx = s.beginTransaction();
		pk = (int) s.save(user);
		tx.commit();
		}
		return pk;
	}

	@Override
	public int updateUser(User u) {
		int uk = 0;
		try(Session s = HibernateUtil.getSession()){
			Transaction tx = s.beginTransaction();
			s.update(u);
			tx.commit();
		}
		return uk;
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
			try(Session s = HibernateUtil.getSession()) {
			
			String hql = "from User where user_name = :usernameVar and pass_word = :passwordVar";
			Query<User> q = s.createQuery(hql, User.class);
			q.setParameter("usernameVar", username);
			q.setParameter("passwordVar", password);
			List<User> u = q.getResultList();
			if (u.size() != 0) {
				return u.get(0);
			}
			return null;
	}



	}

}