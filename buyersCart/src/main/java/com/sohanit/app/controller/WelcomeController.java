package com.sohanit.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Veera
 *
 */

@RestController
public class WelcomeController {

	
	
	

	@RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("welcome");
    }
}
