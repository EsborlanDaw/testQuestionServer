package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring.entity.Pregunta;

public interface PreguntaRespository extends JpaRepository<Pregunta, Long> {

}
