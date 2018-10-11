package com.verizon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.verizon.model.Loan;
import com.verizon.service.CalcServiceImpl;
import com.verizon.service.SimpleInterestCalc;


@Controller
@RequestMapping("/simple")
public class SIController {
	
	@Autowired
	private SimpleInterestCalc sic;
	@GetMapping
	public String defaultWelcomeAction(){
		return "simpleInterestCalcPage";
	}
	
	@PostMapping
	public ModelAndView submitWelcomeFormAction(@ModelAttribute Loan loan){
		
		ModelAndView mv =  new ModelAndView();
		mv.setViewName("simpleInterest");
		loan.setSimpleInterest(sic.calcSimpleInterest(loan));
		loan.setRepayableAmount(sic.calcAmount(loan));
		mv.addObject("simpleInterestvalue",loan.getSimpleInterest());
		mv.addObject("amountvalue",loan.getRepayableAmount());
		mv.addObject("rate",loan);
		return mv;
	
		
	}
}
