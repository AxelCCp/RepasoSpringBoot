package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Usuarios2;

public interface UsuarioService {
	
	public abstract Usuarios2 addUsuarios(Usuarios2 usuarios); 
	
	public abstract List <Usuarios2> listAllUsuarios();
	
	public abstract Usuarios2 findUsuariosById(int id);
	
	public abstract void removeUsuarios(int id);
	
}
