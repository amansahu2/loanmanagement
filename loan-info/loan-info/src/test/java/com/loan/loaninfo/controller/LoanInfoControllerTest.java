package com.loan.loaninfo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.loan.loaninfo.model.LoanInfo;
import com.loan.loaninfo.service.LoanServiceImpl;


@ExtendWith(MockitoExtension.class)
public class LoanInfoControllerTest {

	@Mock
	LoanServiceImpl loanService;
	
	@InjectMocks
	LoanInfoController loanInfoController;
	
	@Test
	void searchLoanByIdTestTrue() {

		LoanInfo loanInfo = new LoanInfo(101,"Ayush","Sinha",201,50000.0,2);
		when(loanInfoController.searchByLoanId(101)).thenReturn(new ResponseEntity<LoanInfo>(loanInfo, HttpStatus.OK));

		ResponseEntity<LoanInfo> responseEntity = loanInfoController.searchByLoanId(101);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
}
