package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;


@Service
public class EmployeeService {
	
	
		
		@Autowired
		private EmployeeRepository repo;
		
		public Employee add(Employee entity) {
			return this.repo.save(entity);
		}

		public Optional<Employee> searchById(int id) {
			return this.repo.findById(id);
		}
		public List<Employee> getAllEmployees()   
		{   
		return this.repo.findAll(); 
		}  
	
		public Employee updateEmployee(Employee entity) {
			return this.repo.save(entity);
		}
		
		public List<Employee>sortByProperty(String propName){
			Sort sort = Sort.by(propName).descending();
			return this.repo.findAll(sort);
			
		}
}
