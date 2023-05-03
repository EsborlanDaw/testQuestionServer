package com.example.spring.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Pregunta;
import com.example.spring.entity.Respuesta;
import com.example.spring.helper.RandomHelper;


@Service
public class JugarService implements JugarInterface {
	
	@Autowired
	PreguntaService preguntaService;
	
	@Autowired
	RespuestaService respuestaService;


	@Override
	public Pregunta getPregunta() {
		
		List <Pregunta> listadoPreguntas;
		
		listadoPreguntas = preguntaService.getAllPreguntas();
		
		Pregunta pregunta = listadoPreguntas.get(RandomHelper.getRandomInt(0, listadoPreguntas.size() - 1));

		return pregunta;
	}

	@Override
	public Respuesta getRespuesta(Long pregunta) {
		
		Respuesta respuesta = respuestaService.getRespuestaByPregunta(pregunta);
		
		return respuesta;
	}

	@Override
	public List <Respuesta> getRespuestasIncorrectas(Long pregunta) {
		
		Respuesta respuestaCorrecta;
		
		respuestaCorrecta = getRespuesta(pregunta);
		
		List <Respuesta> listadoRespuestas = respuestaService.getAllRespuestas();
		List <Respuesta> listadoRespuestasIncorrectas = new ArrayList<>();
		Respuesta respuestaObtenida;
		int contador = 0;
		
		do {
			int buscar = RandomHelper.getRandomInt(0, listadoRespuestas.size() - 1);
			
			respuestaObtenida = listadoRespuestas.get(buscar);
			
			if(respuestaObtenida.getId() != respuestaCorrecta.getId() && !listadoRespuestasIncorrectas.contains(respuestaObtenida)) {

				listadoRespuestasIncorrectas.add(respuestaObtenida);
				contador++;
			}
			
			
		}while(contador != 3 && listadoRespuestasIncorrectas.size()!=3);
		
		listadoRespuestasIncorrectas.add(respuestaCorrecta);
		
		Collections.shuffle(listadoRespuestasIncorrectas);
		
		return listadoRespuestasIncorrectas;
	}

	@Override
	public Long comprobarRespuesta(Long pregunta, Long respuesta) {
		
		Long comprobar = 0L;
		
		if(pregunta == respuesta)
		{
			comprobar = 1L;
		}
		
		return comprobar;
	}
	
	
	

}
