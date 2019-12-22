package com.revature.dao;

import java.util.List;

import com.revature.model.Beer;

public interface BeerDao {
	
	public List<Beer> getBeers();
	public Beer getBeerByName(String name);
	public Beer getBeerByCategory(String category);
	public Beer getBeerByLowApv(String lowapv);
	public Beer getBeerByHighApv(String highapv);
	public Beer getBeerByLowIbu(String lowibu);
	public Beer getBeerByHighIbu(String highibu);
	public Beer getBeerByLowSrm(String lowsrm);
	public Beer getBeerByHighSrm(String highsrm);
	
}
