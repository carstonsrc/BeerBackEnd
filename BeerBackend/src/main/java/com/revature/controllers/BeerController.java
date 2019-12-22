package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Beer;
import com.revature.services.BeerService;

@RestController
@CrossOrigin
public class BeerController {
	
	@Autowired
	private BeerService bs;
	
	@GetMapping("/beers")
	public List<Beer> getBeers(){
		
		return bs.getBeers();
	}
	@GetMapping("/beers/name")
	public Beer getBeerByName(@RequestBody String name) {
		
		return bs.getBeerByName(name);
	}
	@GetMapping("/beers/category")
	public Beer getBeerByCategory(@RequestBody String category) {
		
		return bs.getBeerByCategory(category);
	}
	@GetMapping("/beers/lowapv")
	public Beer getBeerByLowApv(@RequestBody String lowapv) {
		
		return bs.getBeerByLowApv(lowapv);
	}
	@GetMapping("/beers/highapv")
	public Beer getBeerByHighApv(@RequestBody String highapv) {
		
		return bs.getBeerByHighApv(highapv);
	}
	@GetMapping("/beers/lowibu")
	public Beer getBeerByLowIbu(@RequestBody String lowibu) {
		
		return bs.getBeerByLowIbu(lowibu);
	}
	@GetMapping("/beers/highibu")
	public Beer getBeerByHighIbu(@RequestBody String highibu) {
		
		return bs.getBeerByHighIbu(highibu);
	}
	@GetMapping("/beers/lowsrm")
	public Beer getBeerByLowSrm(@RequestBody String lowsrm) {
		
		return bs.getBeerByLowSrm(lowsrm);
	}
	@GetMapping("/beers/highsrm")
	public Beer getBeerByHighSrm(@RequestBody String highsrm) {
		
		return bs.getBeerByHighSrm(highsrm);
	}

}
