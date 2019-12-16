package com.revature.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.query.Query;
import org.hibernate.Session;

import com.revature.util.HibernateUtil;
import com.revature.model.Beer;

public class BeerDaoImpl implements BeerDao{
	
	private static Logger log = Logger.getRootLogger();

	@Override
	public List<Beer> getBeers() {
		Session s = HibernateUtil.getSession();
		
		CriteriaBuilder cb = s.getCriteriaBuilder();
		CriteriaQuery<Beer> cq = cb.createQuery(Beer.class);
		
		Root<Beer> root = cq.from(Beer.class);
		cq.select(root);
		
		Query<Beer> query = s.createQuery(cq);
		List<Beer> beers = query.list();
		
		s.close();
		return beers;
	}

	@Override
	public Beer getBeerByName(String name) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, name);
			log.info("getting name: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByCategory(String category) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, category);
			log.info("getting category: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByLowApv(String lowapv) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, lowapv);
			log.info("getting lowapv: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByHighApv(String highapv) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, highapv);
			log.info("getting highapv: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByLowIbu(String lowibu) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, lowibu);
			log.info("getting lowibu: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByHighIbu(String highibu) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, highibu);
			log.info("getting highibu: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByLowSrm(String lowsrm) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, lowsrm);
			log.info("getting lowsrm: "+ b);
		}	
		return b;
	}

	@Override
	public Beer getBeerByHighSrm(String highsrm) {
		Beer b = null;
		try(Session s = HibernateUtil.getSession()){
			b = s.load(Beer.class, highsrm);
			log.info("getting highsrm: "+ b);
		}	
		return b;
	}
	
	

}
