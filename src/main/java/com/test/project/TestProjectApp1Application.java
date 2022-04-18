package com.test.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.project.service.RegistrationService;

@SpringBootApplication
public class TestProjectApp1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApp1Application.class, args);
	}

}
