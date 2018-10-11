package com.verizon.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @Scope("request") //new obj for each request
// @Scope("session")
// temp memory for a particular time, till that time, server uses the same obj!
// if time expires, diff objects
//@Scope("globalSession")
public class ScopeDemoController {

	private int counter;

	@GetMapping("/scopedemo")
	public ModelAndView defaultAction() {
		counter++;
		return new ModelAndView("sdpage", "count", counter);
	}
}
