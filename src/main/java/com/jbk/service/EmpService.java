package com.jbk.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmpDao;
import com.jbk.entity.Employee;

@Service
public class EmpService {
	//@Autowired
	//SimpleMail mail;
	@Autowired
	EmpDao dao;

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	public String saveEmployee(Employee employee) {
		
		return dao.saveEmployee(employee);
	}

	public String deleteEmployee(long id) {
		
		return dao.deleteEmployee(id);
	}

	public String updateEmployee(Employee employee) {
		
		return dao.updateEmployee(employee);
	}

	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Employee emp = dao.getEmployeeById(id);
		//mail.sendMail("nasirnadaf786@gmail.com", "geting emp by id "+id, emp.toString());
		return emp;
	}

}
