package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;

@Configuration
public class Application {
	
	@Bean     //describe how the object is created
	public Invoice inv1(@Qualifier("ram")Customer rama) {
		return new Invoice(1,2000,rama);
		
	}
	@Bean
	public Invoice inv2(@Qualifier("shyam")Customer rama) {
		return new Invoice(2,3000,rama);
		}
	@Bean
	public Customer ram() {
		return new Customer(11,"ram",54418558,"rama@email.com");
		
	}
	@Bean
	public Customer shyam() {
		return new Customer(12,"shyam",54418552,"shyam@email.com");
		
	}
}
