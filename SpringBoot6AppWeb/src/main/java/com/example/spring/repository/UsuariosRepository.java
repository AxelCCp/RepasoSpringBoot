package com.example.spring.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Usuarios2;

@Repository("usuariosRepository")
public interface UsuariosRepository extends JpaRepository<Usuarios2,Serializable> {
	
	public abstract Usuarios2 findById(int id);

}
