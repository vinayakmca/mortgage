package com.hcl.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.mortgage.entity.Pincode;

@Repository
public interface PincodeRepository extends JpaRepository<Pincode, Long> {

	public Pincode findByPinNumber(String pincode);
}
