/**
 * 
 */
package com.sohanit.appservice.impl;

import org.springframework.stereotype.Service;

import com.sohanit.app.service.LoginService;

/**
 * @author Veera
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String getHome() {
		// TODO Auto-generated method stub
		return "welcome";
	}

}
