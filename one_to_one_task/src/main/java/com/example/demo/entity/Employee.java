package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="employeerk1")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Id
	@Column(name="employeeid")
	private int employeeId;
	@Column(name="employeename")
	private String employeeName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "licence_ref")
	private DrivingLicence licence;

}
