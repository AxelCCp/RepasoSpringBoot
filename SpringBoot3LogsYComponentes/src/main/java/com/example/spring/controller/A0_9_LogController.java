package com.example.spring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.component.A0_9_PrimerComponente;

@Controller
@RequestMapping("/")
public class A0_9_LogController {
	
	
	
	@GetMapping("/metodo1")
	public String metodo1() {
		primerComponente.ejemploComponente();
		LOG.info("ESTAMOS ENTRANDO EN EL MÉTODO 1");
		return "A0_9_view1";
	}
	
	@GetMapping("/metodo2")
	public String metodo2() {
		LOG.info("ESTAMOS ENTRANDO EN EL MÉTODO 2");
		return "A1_9_view2";
	}
	
	
	//CREAMOS UN LOG
	private static final Log LOG = LogFactory.getLog(A0_9_LogController.class);
		
	//HACEMOS INYECCIÓN DE DEPENDENCIAS DESDE VARIABLE DEL PRIMER COMPONENTE
	@Autowired
	@Qualifier("a0_9_PrimerComponente")
	private A0_9_PrimerComponente primerComponente;
	

}
