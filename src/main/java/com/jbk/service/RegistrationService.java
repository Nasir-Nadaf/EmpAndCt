package com.jbk.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.RegistrationDao;
import com.jbk.entity.Registration;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationDao dao;

	public HashMap userLogin(Registration reg) {
		HashMap map=new HashMap<>();
		Registration user=dao.userLogin(reg);
		if(user!=null) {
			map.put("messege","Valid user");
		}else {
			map.put("messege","InValid user");
		}
		
		map.put("user", user);
		
		return map;
	}

}
