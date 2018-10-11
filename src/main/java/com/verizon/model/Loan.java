package com.verizon.model;

public class Loan {

	private float principal;
	private float timePeriod;
	private float rateOfInterest;
	private float repayableAmount;
	private float simpleInterest;

	public float getSimpleInterest() {
		return principal*timePeriod*rateOfInterest/100;
	}

	public void setSimpleInterest(float calcSimpleInterest) {
		this.simpleInterest = simpleInterest;
	}

	public Loan() {

	}

	public float getPrincipal() {
		return principal;
	}

	public void setPrincipal(float principal) {
		this.principal = principal;
	}

	public float getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(float timePeriod) {
		this.timePeriod = timePeriod;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public float getRepayableAmount() {
		return repayableAmount;
	}

	public void setRepayableAmount(float repayableAmount) {
		this.repayableAmount = repayableAmount;
	}



}
