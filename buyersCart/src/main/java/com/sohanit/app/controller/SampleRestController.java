package com.sohanit.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohanit.app.service.LoginService;

@RestController
@RequestMapping("/helloWorld")
public class SampleRestController {
	
	@RequestMapping("/getMethod")
	public String getHelloWorld()
	{
		return "bye";
		
	}
	
	
	

}
