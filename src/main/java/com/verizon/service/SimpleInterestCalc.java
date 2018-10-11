package com.verizon.service;

import com.verizon.model.Loan;

public interface SimpleInterestCalc {

	
	float calcSimpleInterest(Loan loan);
	float calcAmount(Loan loan);
}
