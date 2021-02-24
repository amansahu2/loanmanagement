package com.loan.loaninfo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.loan.loaninfo.model.CustomErrorResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Pod4 This class handles the exceptions
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(LoanInfoNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> UserNotFoundException(LoanInfoNotFoundException ex) {
		CustomErrorResponse response = new CustomErrorResponse();
		response.setTimestamp(LocalDateTime.now());
		response.setMessage(ex.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<CustomErrorResponse>(response, HttpStatus.NOT_FOUND);

	}

}
