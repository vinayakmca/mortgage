package com.hcl.mortgage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pincode_areasqft")
public class Pincode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="pincode")
	private String pinNumber;
	@Column(name="rate_persqft")
	private int ratePerSqFt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPincode() {
		return pinNumber;
	}
	public void setPincode(String pincode) {
		this.pinNumber = pincode;
	}
	public int getRatePerSqFt() {
		return ratePerSqFt;
	}
	public void setRatePerSqFt(int ratePerSqFt) {
		this.ratePerSqFt = ratePerSqFt;
	}
	
	

}
