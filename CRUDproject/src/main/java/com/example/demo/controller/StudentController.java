package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	StudentService studentService;
	@GetMapping("/studentrk")  
	private List<Student> getAllStudents()   
	{  
	return studentService.getAllStudents();  
	}  
	@GetMapping("/studentrk/{id}")  
	private Student getStudent(@PathVariable("id") int id)   
	{  
	return studentService.getStudentById(id);  
	}  
	@DeleteMapping("/studentrk/{id}")  
	private void deleteStudent(@PathVariable("id") int id)   
	{  
		studentService.delete(id);  
	}  
	@PostMapping("/studentrk")  
	private int saveStudent(@RequestBody Student student)   
	{  
		studentService.saveOrUpdate(student);  
	return student.getId();  
	}  
	@PutMapping("/studentrk")  
	private Student update(@RequestBody Student student)   
	{  
		studentService.saveOrUpdate(student);  
	return student;  
	}  

}
