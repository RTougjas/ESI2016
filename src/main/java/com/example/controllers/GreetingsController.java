package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsController {

	@RequestMapping()
	public String welcome() {
		
		return "welcome";
	}
	
}
