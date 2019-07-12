package com.hcl.mortgage.service;

import java.time.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.mortgage.entity.Pincode;
import com.hcl.mortgage.entity.User;
import com.hcl.mortgage.pojo.LoanPojo;
import com.hcl.mortgage.pojo.UserPojo;
import com.hcl.mortgage.repository.LoanRepository;
import com.hcl.mortgage.repository.PincodeRepository;
import com.hcl.mortgage.repository.UserRepository;

import javafx.fxml.LoadException;

@Service
public class MortgageService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PincodeRepository pincodeRepository;
	
	@Autowired
	LoanRepository loanRepository;
	

	public int calculateAge(LocalDate birthDate,LocalDate currentDate) {
		
			return Period.between(birthDate, currentDate).getYears();
		}
	
	public Object saveUser(UserPojo userPojo) throws LoadException {
		User user=new User();
		user.setDOB(userPojo.getBirthDatePojo());
		user.setFullName(userPojo.getFullNamePojo());
		user.setGender(userPojo.getGenderPojo());
		user.setPAN(userPojo.getPanNumberPojo());
		user.setPincode(getPincodeObject(userPojo.getPincodePojo()));
		user.setPropertyAddress(userPojo.getPropertyAddressPojo());
		user.setPropertyType(userPojo.getPropertyTypePojo());
		user.setSalary(userPojo.getSalaryPojo());
		user.setSqrFtArea(userPojo.getSqrFtAreaPojo());
		 
		 if(validateLoan(user)) {
			
			 userRepository.save(user); 
			return  getApprovedLoanDetails(user);
		 }
		else
		{
			return null;
		}	
		
	}
	
	public int calaculatePropertyValue(int areaSize,int sqrtValue) {
		return areaSize*sqrtValue;
	}
	
	public int calaculateLoan(int propertyValue) {
		return propertyValue*(80%100);
	}
	
	public boolean  validateLoan(User user) throws LoadException{
		
		if(calaculatePropertyValue(user.getSqrFtArea(), user.getPincode().getRatePerSqFt())<500000) {
			throw new LoadException("property value should be greater than 500000");
		}
		if(calculateAge(LocalDate.parse(user.getDOB()), LocalDate.now())<25) {
			throw new LoadException("age less than 25");
		}
		
		return true;
		
	}
	
	public Object getApprovedLoanDetails(User user){
		
			int loanAmount=calaculateLoan(calaculatePropertyValue(user.getSqrFtArea(), user.getPincode().getRatePerSqFt()));
			LoanPojo objLoanPojo=new LoanPojo();
			objLoanPojo.setLoanAmount(loanAmount);	
			objLoanPojo.setLoan(loanRepository.findByLoanAmountGreaterThan(loanAmount));
			objLoanPojo.setUserName(user.getFullName());
			return objLoanPojo;
	}
	
	
	
	public Pincode getPincodeObject(String pincode) {
		
		return pincodeRepository.findByPinNumber(pincode);
	}
}
