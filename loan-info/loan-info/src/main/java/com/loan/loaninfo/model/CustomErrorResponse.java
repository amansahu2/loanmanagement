package com.loan.loaninfo.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class CustomErrorResponse {

	private LocalDateTime timestamp;
	private HttpStatus status;
	private String message;

	/**
	 * 
	 */
	public CustomErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param timestamp
	 * @param status
	 * @param message
	 */
	public CustomErrorResponse(LocalDateTime timestamp, HttpStatus status, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomErrorResponse [timestamp=" + timestamp + ", status=" + status + ", message=" + message + "]";
	}

}
