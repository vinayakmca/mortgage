package com.hcl.mortgage.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hcl.mortgage.pojo.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	 @Override
	    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
	        List<String> details = new ArrayList<>();
	        for(ObjectError error : ex.getBindingResult().getAllErrors()) {
	            details.add(error.getDefaultMessage());
	        }
	        ErrorResponse error = new ErrorResponse("Validation Failed", details);
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }
	 
	 @ExceptionHandler(LoanException.class)
	    public final ResponseEntity<Object> handleAllExceptions(LoanException ex, WebRequest request) {
	        List<String> details = new ArrayList<>();
	        details.add(ex.getMessage());
	        ErrorResponse error = new ErrorResponse("Server Error", details);
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }
}
