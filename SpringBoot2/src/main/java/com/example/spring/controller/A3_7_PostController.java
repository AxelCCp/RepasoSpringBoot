package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.spring.model.A0_4_Persona;

@Controller
@RequestMapping("/ejemplopost")
public class A3_7_PostController {
	
	// MÉTODO 1 : NOS DEVUELVE UN FORMULARIO
	@GetMapping("/form")
	public String form(Model modelo) {
		modelo.addAttribute("persona", new A0_4_Persona()); //USAMOS EL CONSTRUCTOR VACÍO YA Q AL PRINCIPIO EL FORMULARIO VIENE VACÍO.
		return "A8_7_formulario";
	}
	
	//MÉTODO 2 : CAPTURA LOS DATOS QUE INGRESEMOS EN EL FORMULARIO 
	//@ModelAttribute("persona") A0_4_Persona persona : NOTACIÓN PARA CAPTURAR LOS DATOS DEL FORMULARIO.
	@PostMapping("/addpersona")
	public ModelAndView resultados(@ModelAttribute("persona") A0_4_Persona persona ) {
		ModelAndView mav = new ModelAndView("A9_8_resultadosFormulario");
		mav.addObject("persona",persona);
		return mav;
	}
	
	
	//CLASE 8 : REDIRECCIONES
	//FORMA 1: 
	/*@GetMapping("/")
	public String redirect1() {
		return "redirect:/ejemplopost/form";
	}*/
	
	//FORMA 2:
	@GetMapping("/")
	public RedirectView redirect2() {
		return new RedirectView("/ejemplopost/form");
	}
	
}
