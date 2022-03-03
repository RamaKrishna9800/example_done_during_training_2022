package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Student;

public class StudentService {
	
	StudentRepository studentRepository;  
	public List<Student> getAllStudents()   
	{  
	List<Student> student = new ArrayList<Student>();  
	studentRepository.findAll().forEach( student::add);  
	return student;  
	}  
	public Student getStudentById(int id)   
	{  
	return studentRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Student student)   
	{  
		studentRepository.save(student);  
	}  
	public void delete(int id)   
	{  
		studentRepository.deleteById(id);  
	}  
	public void update(Student student, int id)   
	{  
		studentRepository.save(student);  
	}  

}
