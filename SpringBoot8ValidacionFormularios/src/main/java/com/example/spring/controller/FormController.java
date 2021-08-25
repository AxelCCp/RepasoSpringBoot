package com.example.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.spring.dao.iEstudianteDAO;
import com.example.spring.entity.Estudiante;
import com.example.spring.service.iEstudianteService;

@Controller
public class FormController {

	//MÉTODO QUE ENTREGA VISTA DEL FORMULARIO
	//EN VEZ DE UN MODEL, USA UN MAP DE LLAMADA PARA RECORRER LA IDENTIDAD
	@GetMapping("/")
	public String form(Map <String,Object> modelo) {
		
		Estudiante estudiante = new Estudiante();
		modelo.put("estudiantes", estudiante);
		modelo.put("titulo", "Formulario de estudiantes");
		return "form";
	}
	
	//MÉTODO PARA GUARDAR DATOS EN EL FORMULARIO
	@PostMapping("/")
	public String guardar(Estudiante estudiante) {
		estudianteService.guardar(estudiante);
		return "redirect:/";
	}
	
	
	//INYECCIÓN DEL DAO
	@Autowired
	private iEstudianteService estudianteService;;
	
}
