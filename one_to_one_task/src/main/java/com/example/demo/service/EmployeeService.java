package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class EmployeeService {
	private EmployeeRepository repo;
	public List<Employee>findAll(){
		return this.repo.findAll();
		
	}

	public Optional<Employee> findById(int id){
		return this.repo.findById(id);
	}
	public Employee add(Employee entity) {
		return this.repo.save(entity);
		
	}

      public void delete(int id) {
		this.repo.deleteById(id);
	}

	public Employee update(Employee entity) {
		return this.repo.save(entity);
	}
}


