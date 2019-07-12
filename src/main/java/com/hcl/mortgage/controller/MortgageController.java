package com.hcl.mortgage.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgage.pojo.UserPojo;
import com.hcl.mortgage.service.MortgageService;

import javafx.fxml.LoadException;

@RestController
@RequestMapping("/loan")
public class MortgageController {
	
	@Autowired
	MortgageService mortagageService;
	
	/**
	 * This API used for Mortgage calculator
	 * @param userPojo user request body
	 * @return user loan summary
	 * @throws LoadException
	 */
	@PostMapping("/request")
	public ResponseEntity<Object> offerLoan( @Valid @RequestBody UserPojo userPojo) throws LoadException{
		return new ResponseEntity<>(mortagageService.saveUser(userPojo),HttpStatus.OK);
	}

}
