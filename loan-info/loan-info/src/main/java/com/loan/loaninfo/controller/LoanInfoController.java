package com.loan.loaninfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loaninfo.model.LoanInfo;
import com.loan.loaninfo.service.LoanService;

@RestController
public class LoanInfoController {

	@Autowired
	private LoanService loanService;

	@GetMapping("/loaninfo/{id}")
	public ResponseEntity<LoanInfo> searchByLoanId(@PathVariable int id) {
		ResponseEntity<LoanInfo> responseEntity = null;

		responseEntity = loanService.searchLoanDetails(id);

		return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);

	}
}
