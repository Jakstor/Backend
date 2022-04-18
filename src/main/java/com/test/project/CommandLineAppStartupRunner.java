package com.test.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.project.service.RegistrationService;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

	@Autowired
	private RegistrationService regiService;
	
	public void run(String...args) throws Exception {
		System.out.println("init started...");
		regiService.fetchAllData();
	}
}
