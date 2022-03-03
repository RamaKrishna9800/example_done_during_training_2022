package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "licencerk")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DrivingLicence {
	@Id
	@Column(name="licencenumber")
	private String licenceNumber;
	@Column(name="expirydate")
	@DateTimeFormat(iso=ISO.DATE)
	private Date expiryDate;
	@Column(name="rto")
	private String rto;

}
