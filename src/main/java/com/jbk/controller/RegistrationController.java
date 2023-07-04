package com.jbk.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Registration;
import com.jbk.service.RegistrationService;

@RestController
@CrossOrigin
@RequestMapping(value="/registration")
public class RegistrationController {
	
	@Autowired
	RegistrationService service;
	
	@PostMapping(value="/login")
	public ResponseEntity<HashMap> userLogin(@RequestBody Registration reg){
		HashMap login=service.userLogin(reg);
		return new ResponseEntity<HashMap>(login,HttpStatus.OK);
	}

}
