package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class A0_2_HolaController {
	
	//CLASE2
	@GetMapping("/home")
	public String home() {
		return "A0_2_vista1";
	}
}
