package com.example.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.entity.Pregunta;

public interface PreguntaInterface {

		public Long createPregunta(Pregunta pregunta);
		public Long updatePregunta(Pregunta pregunta);
		public boolean deletePregunta(Long idPregunta);
		public Pregunta getPregunta(Long idPregunta);
		public List<Pregunta> getAllPreguntas();
}
