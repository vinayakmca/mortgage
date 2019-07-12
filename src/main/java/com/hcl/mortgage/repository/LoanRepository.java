package com.hcl.mortgage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.mortgage.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long> {

	public List<Loan> findByLoanAmountGreaterThan(int loan);
}
