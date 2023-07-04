package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.CountryDao;
import com.jbk.entity.Country;

@Service
public class CountryService {
	@Autowired
	CountryDao dao;

	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		return dao.getAllCountry();
	}

	public String saveCountry(Country Country) {
		
		return dao.saveCountry(Country);
	}

	public String deleteCountry(long id) {
		
		return dao.deleteCountry(id);
	}

	public String updateCountry(Country Country) {
		
		return dao.updateCountry(Country);
	}

	public Country getCountryById(long id) {
		// TODO Auto-generated method stub
		return dao.getCountryById(id);
	}

}
