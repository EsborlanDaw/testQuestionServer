package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Pregunta;
import com.example.spring.entity.Respuesta;

public interface JugarInterface {
	
	public Pregunta getPregunta();
	public Respuesta getRespuesta (Long pregunta);
	public List <Respuesta> getRespuestasIncorrectas (Long pregunta);
	public Long comprobarRespuesta(Long pregunta, Long respuesta);
	
}
