package com.verizon.service;

import org.springframework.stereotype.Service;

import com.verizon.model.Loan;

@Service
public class CalcServiceImpl implements SimpleInterestCalc {




	@Override
	public float calcSimpleInterest(Loan loan) {
	
		return (loan.getPrincipal()*loan.getRateOfInterest()*loan.getTimePeriod())/100 ;
	}

	@Override
	public float calcAmount(Loan loan) {
		// TODO Auto-generated method stub
		return loan.getPrincipal()+loan.getSimpleInterest();
	}

}
