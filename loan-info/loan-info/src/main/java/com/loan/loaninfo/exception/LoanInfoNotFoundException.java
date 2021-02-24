package com.loan.loaninfo.exception;

@SuppressWarnings("serial")
public class LoanInfoNotFoundException extends RuntimeException {

	/**
	 * @param message
	 */
	public LoanInfoNotFoundException(String message) {
		super(message);
	}

	public LoanInfoNotFoundException() {
	}

}
