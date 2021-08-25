package com.example.spring.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring.entity.A0_11_usuario2;


//JpaRepository<A0_11_usuario2, Serializable> : NOS PIDE EL ENTITY Y LE DECIMOS QUE SEA SERIALIZABLE.
//CON ESTO TENEMOS DISPONIBLES LOS MÉTODOS DE JpaRepository

@Repository("usuariorepository") //LE INDICAMOS A SPRING QUE EST VA A SER NUESTR REPOSITORIO
public interface A0_12_UsuarioRepository extends JpaRepository<A0_11_usuario2, Serializable>{

}
