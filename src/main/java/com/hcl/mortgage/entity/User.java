package com.hcl.mortgage.entity;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="full_name")
	private String fullName;
	@Column(name="DOB")
	private String birthDate;
	@Column(name="gender")
	private String gender;
	@Column(name="PAN")
	private String panNumber;
	@Column(name="salary")
	private int salary;
	@Column(name="property_address")
	private String propertyAddress;
	@Column(name="property_type")
	private String propertyType;
	@Column(name="sqft_area")
	private int sqrFtArea;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="pincode")
	private Pincode pinNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDOB() {
		return birthDate;
	}
	public void setDOB(String dOB) {
		birthDate = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPAN() {
		return panNumber;
	}
	public void setPAN(String pAN) {
		panNumber = pAN;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public int getSqrFtArea() {
		return sqrFtArea;
	}
	public void setSqrFtArea(int sqrFtArea) {
		this.sqrFtArea = sqrFtArea;
	}
	public Pincode getPincode() {
		return pinNumber;
	}
	public void setPincode(Pincode pincode) {
		this.pinNumber = pincode;
	}
	
	
	
	
	
	
	
	
}
