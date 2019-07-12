package com.hcl.mortgage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class LoanException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2318738003576055223L;

	public LoanException(String message) {
		super(message);
	}
}
