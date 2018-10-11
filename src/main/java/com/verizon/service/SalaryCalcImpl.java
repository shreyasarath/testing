package com.verizon.service;

import org.springframework.stereotype.Service;

import com.verizon.model.Employee;

@Service
public class SalaryCalcImpl implements SalaryCalculator {

	@Override
	public double gettNetSalary(Employee emp) {

		double netSal=0;
		
		netSal= emp.getBasic()+emp.getHra()+emp.getTa();
		return netSal;
	}

	@Override
	public double gettHRA(Employee emp) {
		
		double hra=0;
		if(emp.getExperience()>3){
			hra=0.2*emp.getBasic();
		}
		else{
			hra=0.12*emp.getBasic();
		}
		return hra;
		
	}

	@Override
	public double gettTA(Employee emp) {
		
		double ta=0;
		if(emp.getExperience()>3){
			ta=0.15*emp.getBasic();
		}
		else{
			ta=0.10*emp.getBasic();
		}
		return ta;
	}

}
