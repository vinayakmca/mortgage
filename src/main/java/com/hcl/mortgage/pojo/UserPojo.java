package com.hcl.mortgage.pojo;


import javax.validation.constraints.Min;


public class UserPojo {

	private String fullNamePojo;
	
	private String birthDatePojo;
	
	private String genderPojo;
	
	private String panNumberPojo;
	
   @Min(value = 10000,message = "Salay should be grater than 10000")
	private int salaryPojo;
	
	private String propertyAddressPojo;

	private String propertyTypePojo;
	
	private int sqrFtAreaPojo;
	
	private String pincodePojo;

	public String getFullNamePojo() {
		return fullNamePojo;
	}

	public void setFullNamePojo(String fullNamePojo) {
		this.fullNamePojo = fullNamePojo;
	}

	public String getBirthDatePojo() {
		return birthDatePojo;
	}

	public void setBirthDatePojo(String birthDatePojo) {
		this.birthDatePojo = birthDatePojo;
	}

	public String getGenderPojo() {
		return genderPojo;
	}

	public void setGenderPojo(String genderPojo) {
		this.genderPojo = genderPojo;
	}

	public String getPanNumberPojo() {
		return panNumberPojo;
	}

	public void setPanNumberPojo(String panNumberPojo) {
		this.panNumberPojo = panNumberPojo;
	}

	public int getSalaryPojo() {
		return salaryPojo;
	}

	public void setSalaryPojo(int salaryPojo) {
		this.salaryPojo = salaryPojo;
	}

	public String getPropertyAddressPojo() {
		return propertyAddressPojo;
	}

	public void setPropertyAddressPojo(String propertyAddressPojo) {
		this.propertyAddressPojo = propertyAddressPojo;
	}

	public String getPropertyTypePojo() {
		return propertyTypePojo;
	}

	public void setPropertyTypePojo(String propertyTypePojo) {
		this.propertyTypePojo = propertyTypePojo;
	}

	public int getSqrFtAreaPojo() {
		return sqrFtAreaPojo;
	}

	public void setSqrFtAreaPojo(int sqrFtAreaPojo) {
		this.sqrFtAreaPojo = sqrFtAreaPojo;
	}

	public String getPincodePojo() {
		return pincodePojo;
	}

	public void setPincodePojo(String pincodePojo) {
		this.pincodePojo = pincodePojo;
	}

		
}
