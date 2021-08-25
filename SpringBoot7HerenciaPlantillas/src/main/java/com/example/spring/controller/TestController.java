package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	/*@GetMapping("/")
	public String test() {
		return "test";
	}*/
	
	//MÉTODO QUE RETORNA LA VISTA BASE
	@GetMapping("/")
	public String test() {
		return "plantillas/base";
	}
	
	//MÉTODO QUE DESPLIEGA LA VISTA test QUE ES LA QUE HEREDA DE BASE
	@GetMapping("/herencia")
	public String herencia() {
		return "test";
	}
}
