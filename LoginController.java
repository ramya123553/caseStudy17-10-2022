package com.gl.caseStudy4Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy4Application.service.MyUsersService;

@RestController
public class LoginController {
	@Autowired
	private MyUsersService service;

	@GetMapping(value = "/loginpage")
	public ModelAndView showLoginPage() {
		return new ModelAndView("loginPage");
	}

	@GetMapping(value = "/loginerror")
	public ModelAndView showErrorPage() {
		return new ModelAndView("loginErrorPage");
	}
}
