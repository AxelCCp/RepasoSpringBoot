package com.example.spring.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("a0_9_PrimerComponente") // ""NOMBRE IDENTIFICATIVO PARA LA INYECCIÓN DE DEPENDENCIAS
public class A0_9_PrimerComponente {

	private static final Log LOG = LogFactory.getLog(A0_9_PrimerComponente.class); 
	
	public void ejemploComponente() {
		LOG.info("Estamos Entrando en el primer componente");
		
	}
}
