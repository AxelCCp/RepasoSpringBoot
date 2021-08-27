package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Estudiante;

public interface iEstudianteService {
	public void guardar(Estudiante estudiante);
	
	public List<Estudiante> listAllEstudiantes();

}
