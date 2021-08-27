package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.dao.iEstudianteDAO;
import com.example.spring.entity.Estudiante;
import com.example.spring.service.iEstudianteService;


@Service
public class EstudianteServiceImpl implements iEstudianteService{

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteDAO.save(estudiante);
	}
	
	
	@Override
	public List<Estudiante> listAllEstudiantes() {
		// TODO Auto-generated method stub
		return estudianteDAO.findAll();
	}
	
	
	@Autowired
	private iEstudianteDAO estudianteDAO;


	

}
