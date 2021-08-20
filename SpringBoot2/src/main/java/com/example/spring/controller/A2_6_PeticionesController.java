package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class A2_6_PeticionesController {
	
	
	
	//METODO 1 
	//HACEMOS LA PETICIÓN GET : localhost:8080/peticiones1?nombre=Ulon  //HECHA A ANDAR EL SERVIDOR Y ESCRIBE ESTA RUTA.
	@GetMapping("/peticiones1")
	public ModelAndView peticiones1(@RequestParam(name="nombre")String nom) {
		ModelAndView mav = new ModelAndView("A7_6_index");
		mav.addObject("nombre", nom);
		return mav;
	}
	
	
	//MÉTODO 2
	//HACEMOS LA PETICIÓN GET DE ESTA OTRA MANERA : localhost:8080/peticiones2/Ulon
	@GetMapping("/peticiones2/{nombre}")
	public ModelAndView peticiones2(@PathVariable(name="nombre")String nom) {
		ModelAndView mav = new ModelAndView("A7_6_index");
		mav.addObject("nombre", nom);
		return mav;
	}
	
}
