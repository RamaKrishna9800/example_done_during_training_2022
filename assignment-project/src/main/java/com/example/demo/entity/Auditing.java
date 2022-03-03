package com.example.demo.entity;



import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rk_audit")
		public class Auditing {
		
		@Id
		@Column(name = "tid")
		private int tId;
		
		@OneToMany(targetEntity = Employee.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
		@JoinColumn(name="audit_ref",referencedColumnName = "eid")
		@Column(name = "employeeid")
		private int employeeId;
		
		@Column(name = "changefrom")
		private String changeFrom;
		
		@Column(name = "changeto")
		private String changeTo;
		
		@Column(name = "createddate")
		
		private LocalDateTime createdDate;
		
		@Column(name = "createdby")
		private String createdBy;
		
		@Column(name = "modifieddate")
		
		private LocalDateTime modifiedDate;
		
		@Column(name = "modifiedby")
		private String modifiedBy;
		
		}
			


