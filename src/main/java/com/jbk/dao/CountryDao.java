package com.jbk.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jbk.entity.Country;

import com.jbk.repo.CountryRepo;

@Repository
public class CountryDao {
	
	@Autowired
	CountryRepo repo;

	public List<Country> getAllCountry() {
		List<Country> list=null;
		list=repo.findAll();
		return list;
	}
	
	
	public String saveCountry(Country country) {
		Optional<Country> dbcountry = repo.findById(country.getcId());
		System.out.println(dbcountry);
		if(!dbcountry.isPresent()) {
			Country save = repo.save(country);
			return "country added successfull......"+save;
		}else {
			return "already present country not added";
		}
	}

	public String deleteCountry(long id) {
		Optional<Country> dbcountry = repo.findById(id);
		System.out.println(dbcountry);
		if(dbcountry.isPresent()) {
			 repo.deleteById(id);
			return "country deleted successfull......";
		}else {
			return "already not present country not deleted";
		}
	}

	public String updateCountry(Country country) {
		Optional<Country> dbcountry = repo.findById(country.getcId());
		System.out.println(dbcountry);
		if(dbcountry.isPresent()) {
			Country save = repo.save(country);
			return "country update successfull......"+save;
		}else {
			return "not present country to update";
		}
		
	}

	public Country getCountryById(long id) {
		Country country=null;
		Optional<Country> dbcountry = repo.findById(id);
		System.out.println(dbcountry);
		if(dbcountry.isPresent()) {
			country = dbcountry.get();
			return country;
		}else {
			return country;
		}
	}
	
	
	

}
