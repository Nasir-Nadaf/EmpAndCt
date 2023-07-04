package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Country;
import com.jbk.exceptions.ResourceNotFoundException;
import com.jbk.service.CountryService;


@RestController
@RequestMapping("/country")
@CrossOrigin
public class CountryController {
	
	@Autowired
	CountryService service;
	
	@GetMapping(value="/getallCountry")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> list=service.getAllCountry();
		if(list!=null) {
			return new ResponseEntity<List<Country>>(list,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Country>>(list,HttpStatus.OK);
		}
		
	}
	
	@PostMapping(value="/save-Country")
	public ResponseEntity<String> saveCountry(@RequestBody  Country Country){
		
		String msg=service.saveCountry(Country);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/delete-Country-by-id/{id}")
	public ResponseEntity<String> deleteCountry(@PathVariable long id){
		String msg=service.deleteCountry(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		
	}
	
	@PutMapping(value="update-Country")
	public ResponseEntity<String> updateCountry(@RequestBody  Country Country){
		
		String msg=service.updateCountry(Country);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

	@GetMapping(value="/get-Country-by-id/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable long id){
		Country emp=service.getCountryById(id);
		if(emp!=null) {
			return new ResponseEntity<Country>(emp,HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Country not found with id= "+id);
		}
		
		
		
	}

}
