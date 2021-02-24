package com.loan.loaninfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanInfo {

	@Id
	@Column(name = "loanId")
	private int loanId;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "loanNumber")
	private int loanNumber;

	@Column(name = "loanAmount")
	private double loanAmount;

	@Column(name = "loanTerm")
	private int loanTerm;

	/**
	 * 
	 */
	public LoanInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param loanId
	 * @param firstName
	 * @param lastName
	 * @param loanNumber
	 * @param loanAmount
	 * @param loanTerm
	 */
	public LoanInfo(int loanId, String firstName, String lastName, int loanNumber, double loanAmount, int loanTerm) {
		super();
		this.loanId = loanId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
		this.loanTerm = loanTerm;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

}
