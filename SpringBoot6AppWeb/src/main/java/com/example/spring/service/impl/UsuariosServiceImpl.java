package com.example.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Usuarios2;
import com.example.spring.repository.UsuariosRepository;
import com.example.spring.service.UsuarioService;


@Service("UsuarioService")
public class UsuariosServiceImpl implements UsuarioService {

	@Override
	public Usuarios2 addUsuarios(Usuarios2 usuarios) {
		//
		return usuariosRepository.save(usuarios);
	}
	
	@Override
	public List <Usuarios2> listAllUsuarios() {
		List <Usuarios2> users = new ArrayList <>();
		users = usuariosRepository.findAll();
		return users ;
	}

	@Override
	public Usuarios2 findUsuariosById(int id) {
		
		return usuariosRepository.findById(id);
	}

	@Override
	public void removeUsuarios(int id) {
		Usuarios2 us = findUsuariosById(id);
		if(us!=null) usuariosRepository.delete(us);
	}
	
	//INYECCIÓN DEL REPOSITORIO EN EL SERVICIO
	@Autowired
	@Qualifier("usuariosRepository")
	private UsuariosRepository usuariosRepository;

}
