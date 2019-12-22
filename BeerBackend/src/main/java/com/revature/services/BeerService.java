package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.BeerDao;
import com.revature.model.Beer;

@Service
public class BeerService {

	@Autowired
	private BeerDao beerdao;
	
	public BeerService() {
		super();
	}
	
	public List<Beer> getBeers(){
		return beerdao.getBeers();
	}
	public Beer getBeerByName(String name) {
		return beerdao.getBeerByName(name);
	}
	public Beer getBeerByCategory(String category) {
		return beerdao.getBeerByCategory(category);
	}
	public Beer getBeerByLowApv(String lowapv) {
		return beerdao.getBeerByLowApv(lowapv);
	}
	public Beer getBeerByHighApv(String highapv) {
		return beerdao.getBeerByHighApv(highapv);
	}
	public Beer getBeerByLowIbu(String lowibu) {
		return beerdao.getBeerByLowIbu(lowibu);
	}
	public Beer getBeerByHighIbu(String highibu) {
		return beerdao.getBeerByHighIbu(highibu);
	}
	public Beer getBeerByLowSrm(String lowsrm) {
		return beerdao.getBeerByLowSrm(lowsrm);
	}
	public Beer getBeerByHighSrm(String highsrm) {
		return beerdao.getBeerByHighSrm(highsrm);
	}
	
}