package com.verizon.service;

import com.verizon.model.Employee;

public interface SalaryCalculator {

	public double gettNetSalary(Employee emp);
	public double gettHRA(Employee emp);
	public double gettTA(Employee emp);
	
}
