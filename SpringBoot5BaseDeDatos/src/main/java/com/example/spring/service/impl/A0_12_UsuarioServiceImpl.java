package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring.entity.A0_11_usuario2;
import com.example.spring.repository.A0_12_UsuarioRepository;
import com.example.spring.service.A0_12_UsuarioService;

@Service("usuarioservice")
public class A0_12_UsuarioServiceImpl implements A0_12_UsuarioService {

	@Override
	public List<A0_11_usuario2> listAllUsuario() {
		//findAll() : SIRVE PARA LISTAR LOS USUARIOS
		return usuarioRepository.findAll();
	}

	@Override
	public A0_11_usuario2 addUsuario(A0_11_usuario2 usuario) {
		//save(usuario2): SIRVE PARA AÑADIR LOS REGISTROS Y POR PARÁMETRO NOS PIDE EL ENTITY.  
		return usuarioRepository.save(usuario);
	}
	
	
	//INYECTAMOS EL REPOSITORIO
	@Autowired
	@Qualifier(value="usuariorepository")
	private A0_12_UsuarioRepository usuarioRepository;

}
