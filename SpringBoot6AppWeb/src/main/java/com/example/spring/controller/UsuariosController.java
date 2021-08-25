package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring.entity.Usuarios2;
import com.example.spring.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	
	//ESTE MÉTODO DEVUELVE LA VISTA PARA EL FORMULARIO DE AGREGAR, MODIFICAR Y ELIMINAR USUARIOS.
	@GetMapping("/usersform")
	public String userform(Model modelo, @RequestParam(name="id",required=true) int id) {
		
		Usuarios2 us = new Usuarios2();
		
		if(id!=0) {us = usuarioService.findUsuariosById(id);}
		
		modelo.addAttribute("usuarios", us); 
		
		return "usersform";
	}
	
	
	//MÉTODO QUE GESTIONA EL AÑADIDO DE USUARIOS Y RETORNA A USERS
	@PostMapping("/addusuarios")
	public String addusuarios(@ModelAttribute(name="usuarios")Usuarios2 usuarios) {
		usuarioService.addUsuarios(usuarios);
		return "redirect:/usuarios/listadoUsers";
	}
	
	//MÉTODO QUE NOS DEVUELVE LA TABLA CON LOS USUARIOS REGISTRADOS
	@GetMapping("/listadoUsers")
	public ModelAndView listadoUsers() {
		ModelAndView mav = new ModelAndView("users");
		mav.addObject("users", usuarioService.listAllUsuarios());
		return mav;
	}
	
	
	//MÉTODO QUE 
	@GetMapping("/removeusuarios")
	public ModelAndView removeUsuarios(@RequestParam(name="id",required=true) int id) {
		usuarioService.removeUsuarios(id);
		return listadoUsers();
	}
	
	
	//INYECCIÓN DEL SERVICIO
	@Autowired 
	@Qualifier("UsuarioService")
	private UsuarioService usuarioService;
}
