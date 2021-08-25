package com.example.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Estudiante;

@Repository
public interface iEstudianteDAO extends JpaRepository<Estudiante,Long>{

}
