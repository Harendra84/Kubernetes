package com.rest.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rest.exception.ServerNotFoundException;
import com.rest.model.ErrorDetails;

@RestControllerAdvice
public class ServerControllerAdvice {
	
	@ExceptionHandler(ServerNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleActotrNotFoundException(ServerNotFoundException snfe){
		System.out.println("ServerControllerAdvice.handleServerNotFoundException");
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), "404", snfe.getMessage()); // specific exception
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllException(Exception e){
		System.out.println("ServerControllerAdvice.handleAllException");
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), "404", e.getMessage()); // all exception
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}
}