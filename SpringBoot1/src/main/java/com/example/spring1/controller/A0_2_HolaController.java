package com.example.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class A0_2_HolaController {
	
	@GetMapping("/home")
	public String home() {
		return "A0_2_holaMundo";
	}

}
