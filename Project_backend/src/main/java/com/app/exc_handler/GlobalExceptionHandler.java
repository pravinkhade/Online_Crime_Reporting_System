package com.app.exc_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.custom_excs.PoliceHandlingException;
import com.app.dto.ErrorResponse;

@ControllerAdvice // Mandatory class level annotation to tell SC whatever follows is centralized
					// exc handler class
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
//exc handling method/s :
	@ExceptionHandler(PoliceHandlingException.class)
	public ResponseEntity<ErrorResponse> handlePoliceHandlingException(PoliceHandlingException e) {
		System.out.println("in handle police exc");
		return new ResponseEntity<>(new ErrorResponse("Invalid Login", e.getMessage()),
				 HttpStatus.UNAUTHORIZED);
	}
//	@ExceptionHandler(UserHandlingException.class)
//	public ResponseEntity<ErrorResponse> handleBankAccountHandlingException(BankAccountHandlingException e) {
//		System.out.println("in handle user exc");
//		return new ResponseEntity<>(new ErrorResponse("User Related error",e.getMessage()),
//				 HttpStatus.BAD_REQUEST);
//	}
	//catch all -- equivalent
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception e) {
		System.out.println("in handle any exc");
		return new ResponseEntity<>(new ErrorResponse("Servr side error !!!!",e.getMessage()),
				 HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
