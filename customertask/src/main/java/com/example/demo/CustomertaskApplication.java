package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomertaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cts=SpringApplication.run(CustomertaskApplication.class, args);
	
	System.out.println(cts.getBean("inv1"));
	System.out.println(cts.getBean("inv2"));

	

	
	}

}
