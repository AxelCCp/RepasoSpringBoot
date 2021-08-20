package com.example.spring.model;

public class A0_4_Persona {
	
	public A0_4_Persona() {
		
	}
	
	public A0_4_Persona(String nombre, int telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	private String nombre;
	private int telefono;
}
