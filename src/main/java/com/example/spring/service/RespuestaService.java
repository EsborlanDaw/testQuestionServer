package com.example.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Pregunta;
import com.example.spring.entity.Respuesta;
import com.example.spring.repository.RespuestaRepository;

@Service
public class RespuestaService implements RespuestaInterface{
	
	@Autowired
	RespuestaRepository respuestaRepo;
	
	@Autowired
	PreguntaService preguntaServ;

	@Override
	public Long createRespuesta(Respuesta respuesta) {
		return respuestaRepo.save(respuesta).getId();
	}

	@Override
	public Long updateRespuesta(Respuesta respuesta) {
		return respuestaRepo.save(respuesta).getId();
	}

	@Override
	public boolean deleteRespuesta(Long idRespuesta) {
		
		boolean comprobar= false;
		respuestaRepo.deleteById(idRespuesta);
	
		if(!respuestaRepo.existsById(idRespuesta)) {
			comprobar = true;
		}
		return comprobar;
	}

	@Override
	public Respuesta getRespuesta(Long idRespuesta) {
		Respuesta respuesta;
		respuesta = respuestaRepo.getReferenceById(idRespuesta);
		return respuesta;
	}

	@Override
	public Respuesta getRespuestaByPregunta(Long idPregunta) {
		Respuesta respuesta;
		respuesta = respuestaRepo.findByPreguntaId(idPregunta);
		return respuesta;
	}

	@Override
	public List<Respuesta> getAllRespuestas() {
		List <Respuesta> listadoRespuestas = new ArrayList <>();
		listadoRespuestas = respuestaRepo.findAll();
		return listadoRespuestas;
	}

}
