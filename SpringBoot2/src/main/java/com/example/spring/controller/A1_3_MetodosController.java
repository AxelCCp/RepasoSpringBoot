package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring.model.A0_4_Persona;

@Controller
@RequestMapping("/")
public class A1_3_MetodosController {
	
	
	//MÉTODO1 (CLASE3)
	@RequestMapping(value="/metodo1", method=RequestMethod.GET)
	public String metodo1() {
		return "A1_3_vista2";
	}
	
	//MÉTODO2 (CLASE3)
	//ModelAndView : CLASE DE SPRING QUE PERMITE DEVOLVER TANTO UN MODELO COMO UNA VISTA, EN UN ÚNICO VALOR DE RETORNO.  
	//@RequestMapping(value="/metodo2", method=RequestMethod.GET)
	@GetMapping("/metodo2") //SIMPLIFICACIÓN
	public ModelAndView metodo2() {
		return new ModelAndView("A2_3_vista3");
	}
	
	//MÉTODO3 (CLASE4)
	//MÉTODO PARA INSERTAR DATOS DESDE CÓDIGO JAVA
	@GetMapping("/metodo3")
	public String metodo3(Model modelo) {
		modelo.addAttribute("nombre", "Gran Rey Pilaf");
		return "A3_4_vista4";
	}
	
	//MÉTODO4 (CLASE4)
	//MÉTODO PARA INSERTAR DATOS DESDE CÓDIGO JAVA
	@GetMapping("/metodo4") 
	public ModelAndView metodo4() {
		
		ModelAndView mav = new ModelAndView("A3_4_vista4");
		mav.addObject("nombre2", "KingCold");
		return mav;
	}
	
	//MÉTODO5 (CLASE4) USAMOS LA CLASE PERSONA
	@GetMapping("/metodo5")
	public String metodo5(Model modelo) {
		modelo.addAttribute("persona", new A0_4_Persona("Bra", 12356127));
		return "A4_4_vista5";
	}
	
	//MÉTODO6 (CLASE4) USAMOS LA CLASE PERSONA
	@GetMapping("/metodo6")
	public ModelAndView metodo6() {
		ModelAndView mav = new ModelAndView("A5_4_vista6");
		mav.addObject("persona", new A0_4_Persona("Puar",24342323));
		return mav;
	}
	
	
	//MÉTODO 7 (CLASE 5) DEVUELVE UN LISTADO DE PERSONAS
	@GetMapping("/metodo7")
	public String metodo7(Model modelo) {
		modelo.addAttribute("p", getPersonas());
		return "A6_5_vista7";
	}
	
	//MÉTODO 8 (CLASE 5) DEVUELVE UN LISTADO DE PERSONAS
	@GetMapping("/metodo8")
	public ModelAndView metodo8() {
		ModelAndView mav = new ModelAndView("A6_5_vista7");
		mav.addObject("p", getPersonas());
		return mav;
	}
	
	
	private List<A0_4_Persona> getPersonas(){
		List<A0_4_Persona> p = new ArrayList();
		p.add(new A0_4_Persona("Giru",1236152));
		p.add(new A0_4_Persona("Tsubasa",23423434));
		p.add(new A0_4_Persona("Tom Misaki",23232498));
		p.add(new A0_4_Persona("Textex",98789765));
		return p;
	}
	
	
}
