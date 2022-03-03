package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.ifaces.CurrencyConverter;
import com.example.demo.service.CurrencyConverterService;

@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(AopExampleApplication.class, args);
		//CurrencyConverterService service = ctx.getBean(CurrencyConverterService.class);
		CurrencyConverter service = ctx.getBean(CurrencyConverter.class);
		System.out.println(service.getClass().getName());
		System.out.println(service.inrToEuro(100));
		System.out.println(service.inrToUsd(140));
		
	}

}
