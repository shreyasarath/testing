package com.verizon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	@RequestMapping(value={"","/","/home"},method=RequestMethod.GET)
	public String defaultAction(){
		return "home";
	}

	@RequestMapping(value="/aboutUs", method=RequestMethod.GET)
	public ModelAndView aboutUsAction(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("aboutPage");
		mv.addObject("webmaster","Santhosh");
		mv.addObject("devTeam", new String[]{"Amit", "Noushin","lini"});
		mv.addObject("adminMailId", "santhosh@gmail.com");
		return mv;
	}

}
