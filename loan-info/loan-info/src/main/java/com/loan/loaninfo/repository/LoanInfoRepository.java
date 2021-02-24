package com.loan.loaninfo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loaninfo.model.LoanInfo;

@Repository
public interface LoanInfoRepository extends JpaRepository<LoanInfo, Integer> {
	LoanInfo findByLoanId(int id);
}
