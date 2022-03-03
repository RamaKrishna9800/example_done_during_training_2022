package com.example.demo.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api/v1")
@Slf4j
public class EmployeeController {
	@Autowired
  public EmployeeService service;
	
	@GetMapping(path ="/employees")
	@RolesAllowed({"ROLE_admin"})
	
	public List<Employee> getEmployee() {
		return this.service.getAllEmployees();
		
	}
	@GetMapping(path = "/employee/{id}")
	@RolesAllowed({"ROLE_admin"})
	public Optional<Employee> getEmployeeById(@PathVariable("id")int id) {
		return this.service.searchById(id);
					
			
	}
	@PostMapping(path ="/employee")
	@RolesAllowed({"ROLE_admin"})
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		System.out.println(employee);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(employee.getPhoneNumber())
				.toUri();
		Employee addedEntity = this.service.add(employee);
		return ResponseEntity.created(uri).body(addedEntity);
	}
	@PutMapping(path="/employee")
	@RolesAllowed({"ROLE_admin"})
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
	Employee updated = this.service.updateEmployee(employee);
	return ResponseEntity.status(HttpStatus.OK).body(updated);
	
}
	@GetMapping(path="/employee/sort")
	@RolesAllowed({"ROLE_admin"})
	public List<Employee>getSortedEmployeeList(@RequestParam(defaultValue="designation")String propName){
		return this.service.sortByProperty(propName);
	}
	}


