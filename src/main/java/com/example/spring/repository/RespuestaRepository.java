package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring.entity.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
	
	Respuesta findByPreguntaId(Long id_pregunta);

}
