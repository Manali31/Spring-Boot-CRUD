package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeContactDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeContactDetailsApplication.class, args);
		
		System.out.println("Working fine. Application started on localhost port 8080.");
	}

}
