package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.spring.entity.A0_11_usuario2;
import com.example.spring.service.impl.A0_12_UsuarioServiceImpl;

@Controller
@RequestMapping("/user")
public class A0_12_UsuarioController {

	//MÉTODO QUE ENTREGA LA LISTA DE USUARIOS
	@GetMapping("/list")
	public ModelAndView listAllUsuarios() {
		ModelAndView mav = new ModelAndView("A0_12_list");
		mav.addObject("usuarios", usuarioService.listAllUsuario());
		mav.addObject("user", new A0_11_usuario2());
		return mav;
	}
	
	
	
	//MÉTODO PARA AGREGAR USUARIOS
	@PostMapping("addusers")
	public String addUsers(@ModelAttribute(name="users")A0_11_usuario2 usuario) {
		
		usuarioService.addUsuario(usuario);
		
		return "redirect:/user/list";
	}
	
	
	//INYECTAMOS EL SERVICE
	@Autowired
	@Qualifier("usuarioservice")
	private A0_12_UsuarioServiceImpl usuarioService;
}
