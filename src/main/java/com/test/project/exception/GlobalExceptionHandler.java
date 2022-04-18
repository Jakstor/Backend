package com.test.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmailIdExistException.class)
	public ResponseEntity<String> EmailIdDuplicateException (EmailIdExistException exception){
		return new ResponseEntity<String>("Email-Id already exist", HttpStatus.BAD_REQUEST);
	}
}
