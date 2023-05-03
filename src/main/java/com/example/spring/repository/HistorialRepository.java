package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Historial;


public interface HistorialRepository extends JpaRepository<Historial, Long>{

	Historial findByUsuarioId(Long id_usuario);
}
