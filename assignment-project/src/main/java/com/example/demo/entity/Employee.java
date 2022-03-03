package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name="rk_employee")
public class Employee {






	@Id
	@Column(name="eid")
	private int eId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="fathername")
	private String fatherName;
	
	@Column(name="phonenumber")
	private long phoneNumber;
	
	@Column(name="address")
	private String address;
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@Column(name="designationid")
	private Designation desginationId;
	
	@Column(name="location")
	private String location;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="dateofbirth")
	LocalDate dateOfBirth;
	
	@Column(name="dateofjoining")
	LocalDate dateOfJoining;
	
	@Column(name="createdby")
	private String createdBy;
	
	@Column(name="createddate")
	LocalDate createdDate;
	
	@Column(name="modifieddate")
	LocalDate modifiedDate;
	
	@Column(name="modifiedby")
	private String modifiedBy;
	
	
	
	
	
	}