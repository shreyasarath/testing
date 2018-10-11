package com.verizon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.verizon.model.Book;
import com.verizon.model.Employee;
import com.verizon.model.Loan;
import com.verizon.service.CalcServiceImpl;
import com.verizon.service.SalaryCalculator;
import com.verizon.service.SimpleInterestCalc;


@Controller
@RequestMapping("/salary")
public class SalaryController {
	
	@Autowired
	private SalaryCalculator sc;
	
	@GetMapping
	public ModelAndView defaultWelcomeAction(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("salaryFormPage");
		mv.addObject("emp",new Employee());
		mv.addObject("posibDept",new String[]{"CSE","ECE","HR","FINANCE"});
		mv.addObject("posibGender",new String[]{"Male","Female"});
		return mv;
	}
	
	@PostMapping
	public ModelAndView submitWelcomeFormAction(@ModelAttribute("emp") Employee emp){
		
		ModelAndView mv =  new ModelAndView();
		mv.setViewName("salaryOutput");
		emp.setHra(sc.gettHRA(emp));
		emp.setTa(sc.gettTA(emp));
		emp.setNetPay(sc.gettNetSalary(emp));
		mv.addObject("obj",emp);
	
		return mv;
	
		
	}
}
