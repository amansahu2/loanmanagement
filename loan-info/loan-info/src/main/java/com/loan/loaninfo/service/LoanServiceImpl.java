package com.loan.loaninfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loan.loaninfo.exception.LoanInfoNotFoundException;
import com.loan.loaninfo.model.LoanInfo;
import com.loan.loaninfo.repository.LoanInfoRepository;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanInfoRepository lr;

	@Override
	public ResponseEntity<LoanInfo> searchLoanDetails(int id) {
		LoanInfo li = lr.findByLoanId(id);
		if (li != null) {
			return new ResponseEntity<>(li, HttpStatus.OK);

		}

		throw new LoanInfoNotFoundException("Loan info with corresponding Id does not exist");
	}
}
