package com.example.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.model.A0_10_Persona;
import com.example.spring.service.A0_10_PrimerService;


@Service("primerservice") //LE INDICAMOS A SPRING QUE HEMOS CREADO UN SERVICIO
public class A0_10_PrimerServiceImpl implements A0_10_PrimerService {

	@Override
	public List<A0_10_Persona> getPersonas() {
		// TODO Auto-generated method stub
		List <A0_10_Persona> p = new ArrayList();
		p.add(new A0_10_Persona("Dr.","Gero"));
		p.add(new A0_10_Persona("Dr.","Slamp"));
		p.add(new A0_10_Persona("Dr.","Myu"));
		p.add(new A0_10_Persona("Dra.","Nain"));
		
		return p;
	}

}
