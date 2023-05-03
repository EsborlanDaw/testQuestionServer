package com.example.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Pregunta;
import com.example.spring.repository.PreguntaRespository;

@Service
public class PreguntaService implements PreguntaInterface{
	
	@Autowired
	PreguntaRespository preguntaRepo;

	@Override
	public Long createPregunta(Pregunta pregunta) {
		
		pregunta.setId(0L);
		
		return preguntaRepo.save(pregunta).getId();
	}

	@Override
	public Long updatePregunta(Pregunta pregunta) {
		return preguntaRepo.save(pregunta).getId();
	}

	@Override
	public boolean deletePregunta(Long idPregunta) {
		
		boolean comprobar= false;
		
		preguntaRepo.deleteById(idPregunta);
		
		if(!preguntaRepo.existsById(idPregunta)) {
			comprobar = true;
		}
		return comprobar;
	}

	@Override
	public Pregunta getPregunta(Long idPregunta) {
	
		Pregunta pregunta;
		pregunta = preguntaRepo.getReferenceById(idPregunta);
		return pregunta;
	}
	
	@Override
	public List<Pregunta> getAllPreguntas() {
		List <Pregunta> listadoPreguntas = new ArrayList <>();
		listadoPreguntas = preguntaRepo.findAll();
		return listadoPreguntas;
	}

}
