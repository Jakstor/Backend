package com.test.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.project.dto.EmailLoginDTO;
import com.test.project.dto.RegistrationDto;
import com.test.project.exception.EmailIdExistException;
import com.test.project.model.RegistrationModel;
import com.test.project.repo.RegistrationRepo;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepo repo;
	
	List<RegistrationModel> regData = new ArrayList<>();
	HashMap<String, String> emailMap = new HashMap<>();
	HashMap<Long, String> mobileMap = new HashMap<>();
	
	public void fetchAllData(){
		regData = repo.findAll();
		for(RegistrationModel data: regData) {
			String emailId = data.getEmlId();
			String pass = data.getPswd();
			Long mobile = data.getPhnNum();
			emailMap.put(emailId, pass);
			mobileMap.put(mobile, pass);
		}
	}
	
	public Integer saveData (RegistrationDto regDto) throws Exception {
		Boolean verifyEmail = findEmailId(regDto.getEmailId());
		if(verifyEmail) {
			RegistrationModel regModel = new RegistrationModel();
			regModel.setFrstNm(regDto.getFirstName());
			regModel.setMdleNm(regDto.getMiddleName());
			regModel.setLstNm(regDto.getLastName());
			regModel.setEmlId(regDto.getEmailId());
			regModel.setPhnNum(Long.parseLong(regDto.getPhone()));
			regModel.setPswd(regDto.getConfirmPassword());
			repo.save(regModel);
			fetchAllData();
			return regModel.getRgstrnId();
		}
		else {
			throw new EmailIdExistException("400","Email-Id already exist");
		}
	}
	
	public boolean findEmailId(String emailId) {
		RegistrationModel regModelList = repo.findByEmlId(emailId);
		if(regModelList == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public EmailLoginDTO emailLogin(String email, String password) {
		if(emailMap.get(email).equals(password)) {
			RegistrationModel regModel = repo.findByEmlId(email);
			EmailLoginDTO emaillogin = new EmailLoginDTO();
			emaillogin.setLogin(true);
			emaillogin.setUserName(regModel.getFrstNm());
			return emaillogin;
		}
		else {
			EmailLoginDTO emaillogin = new EmailLoginDTO();
			emaillogin.setLogin(false);
			emaillogin.setUserName(null);
			return emaillogin;
		}
	}
	
	public boolean mobileLogin(String mobile, String password) {
		Long phn = Long.parseLong(mobile);
		if(mobileMap.get(phn).equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
}
