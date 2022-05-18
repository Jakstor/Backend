package com.test.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.test.project.dto.EmailLoginDTO;
import com.test.project.dto.RegistrationDto;
import com.test.project.model.RegistrationModel;
import com.test.project.service.RegistrationService;

@RestController
@CrossOrigin
public class RegisterController {
	
	@Autowired
	private RegistrationService service;
	
	@GetMapping("/home")
	public String getName() {
		return "Hello";
	}
	
//	@GetMapping("/fetchAllData")
//	public List<RegistrationModel> fetchAllData(){
//		List<RegistrationModel> regData = service.fetchAllData();
//		return regData;
//	}
	
	@PostMapping("/saveData")
	public Integer savaeData(@RequestBody RegistrationDto requestDto) throws Exception {
		System.out.println(requestDto.getPhone());
		Integer regId = service.saveData(requestDto);
		return regId;
	}
	
	@GetMapping("/email-login")
	public EmailLoginDTO emailLogin(@RequestHeader String emailId, @RequestHeader String password) {
		return service.emailLogin(emailId, password);
	}
	
	@GetMapping("/mobile-login")
	public boolean mobileLogin(@RequestHeader String mobile, @RequestHeader String password) {
		return service.mobileLogin(mobile, password);
	}
}
