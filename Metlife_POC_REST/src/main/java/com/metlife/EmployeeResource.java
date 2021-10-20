package com.metlife;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class EmployeeResource {
	@Autowired
	EmployeeRepo repo;

	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("allemployee")
	public List<Employee> getEmployee(){
		
		List<Employee> employees=(List<Employee>) repo.findAll();
				
		return employees;
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("addemployee")
	public Employee addEmployee(@RequestBody Employee e){
		
		repo.save(e);
				
		return e;
	}

	
}
