package com.loan.loaninfo.service;

import org.springframework.http.ResponseEntity;

import com.loan.loaninfo.model.LoanInfo;

public interface LoanService {

	ResponseEntity<LoanInfo> searchLoanDetails(int id);

}
