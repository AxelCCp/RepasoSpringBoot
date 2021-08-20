package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.model.A0_10_Persona;
import com.example.spring.service.A0_10_PrimerService;

@Controller
@RequestMapping("/")
public class A0_10_ServiceController {

	@GetMapping("/listado")
	public String listadoPersonas(Model modelo) {
		modelo.addAttribute("p",primerservice.getPersonas()); 				 // "p" de : List <A0_10_Persona> p = new ArrayList() en A0_10_PrimerService;
		return "A0_10_listado";
	}
	
	
	//INYECTAMOS EL SERVICIO DE class A0_10_PrimerServiceImpl
	@Autowired
	@Qualifier("primerservice")
	private A0_10_PrimerService primerservice;
}
