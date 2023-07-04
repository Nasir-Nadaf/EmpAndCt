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

import com.jbk.entity.Employee;
import com.jbk.exceptions.ResourceNotFoundException;
import com.jbk.service.EmpService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	EmpService service;
	
	@GetMapping(value="/get-all-employee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> list=service.getAllEmployee();
		if(list!=null) {
			return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		}
		
	}
	
	@PostMapping(value="/save-employee")
	public ResponseEntity<String> saveEmployee(@RequestBody  Employee employee){
		
		String msg=service.saveEmployee(employee);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/delete-employee-by-id/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable long id){
		String msg=service.deleteEmployee(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		
	}
	
	@PutMapping(value="update-employee")
	public ResponseEntity<String> updateEmployee(@RequestBody  Employee employee){
		
		String msg=service.updateEmployee(employee);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

	@GetMapping(value="/get-employee-by-id/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
		Employee emp=service.getEmployeeById(id);
		if(emp!=null) {
			return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Employee not found with id= "+id);
		}
		
		
		
	}

}
