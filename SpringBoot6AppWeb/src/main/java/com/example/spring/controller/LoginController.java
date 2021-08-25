package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring.model.Credenciales;

@Controller
public class LoginController {
	
	//MÉTODO QUE REDIRIGE AL LOGIN
	@GetMapping("/")
	public String redirectLogin() {
		return "redirect:/login";
	}
	
	
	//MÉTODO QUE DIRIGE AL LOGIN
	//@RequestParam(name="error") String error : SI EL USUARIO INGRESA CREDENCIALES INCORRECTAS, LANZARÁ MENSAJE DE ERROR.
	//TAMBN INCLUIMOS UN PARÁMETRO PARA EL LOGOUT
	//AÑADIMOS EL CONSTRUCTOR VACÍO DE LA CLASE CREDENCIALES, PARA Q EL PROGRAMA SEPA QUE ESTAMOS TRABAJANDO CON ESTA CLASE.
	@GetMapping("/login")
	public String login(Model modelo,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		modelo.addAttribute("error",error);
		modelo.addAttribute("logout",logout);
		modelo.addAttribute("credenciales", new Credenciales());
		return"login";
	}
	
	
	// MÉTODO QUE RETORNA LISTADO DE USUARIOS. EN ESTA PLANTILLA TAMBN PODEMOS AGREGAR USUARIOS 
	@PostMapping("/check")
	public String check(@ModelAttribute(name="credencial") Credenciales credenciales){
		if(credenciales.getNombre().equals("Bra") && credenciales.getPass().equals("234")) return "redirect:/usuarios/listadoUsers";
		else return "redirect:/login";
	}
	
	
	

}
