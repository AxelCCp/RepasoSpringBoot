package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.A0_11_usuario2;

public interface A0_12_UsuarioService {
	
	//MÉTODO PARA LISTAR USUARIOS  AÑADIR USUARIOS
	public abstract List<A0_11_usuario2> listAllUsuario();
	
	
	//MÉTODO PARA AÑADIR USUARIOS
	public abstract A0_11_usuario2 addUsuario(A0_11_usuario2 usuario);
	
}
