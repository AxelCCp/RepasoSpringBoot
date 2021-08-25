package com.example.spring.model;

//EL MODELO

public class Credenciales {

	public Credenciales() {}
	
	public Credenciales(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	private String nombre;
	private String pass;
	
}
