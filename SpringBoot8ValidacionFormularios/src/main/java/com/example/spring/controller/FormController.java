package com.example.spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		modelo.put("estudiante", estudiante);
		modelo.put("titulo", "Formulario de estudiantes");
		return "form";
	}
	
	//MÉTODO PARA GUARDAR DATOS EN EL FORMULARIO
	@PostMapping("/")
	public String guardar(@Valid Estudiante estudiante, BindingResult result, RedirectAttributes flash) {
		if(result.hasErrors()) return "form";

		estudianteService.guardar(estudiante);
		flash.addFlashAttribute("success","Estudiante guardado con éxito");
		return "redirect:/";
	}
	
	
	//METODO QUE DESPLIEGA LA VISTA DE LIST
	@GetMapping("/list")
	public String list(Model modelo) {
		modelo.addAttribute("estudiantes", estudianteService.listAllEstudiantes());
		modelo.addAttribute("titulo", "listado de estudiantes");
		modelo.addAttribute("encabezado", "Listado de estudiantes");
		return "list";
	}
	
	
	//INYECCIÓN DEL DAO
	@Autowired
	private iEstudianteService estudianteService;;
	
}
