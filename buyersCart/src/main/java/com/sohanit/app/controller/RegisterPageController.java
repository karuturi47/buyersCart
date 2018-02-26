package com.sohanit.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterPageController {
	
	
	@RequestMapping("/register")
	public ModelAndView getRegisterPage()
	{
		return new ModelAndView("registerPage");
	}

}
