package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Respuesta;

public interface RespuestaInterface {

	public Long createRespuesta(Respuesta respuesta);
	public Long updateRespuesta(Respuesta respuesta);
	public boolean deleteRespuesta(Long idRespuesta);
	public Respuesta getRespuesta(Long idRespuesta);
	public Respuesta getRespuestaByPregunta(Long idPregunta);
	public List<Respuesta> getAllRespuestas();
}
