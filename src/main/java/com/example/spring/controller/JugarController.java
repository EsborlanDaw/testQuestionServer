package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Pregunta;
import com.example.spring.entity.Respuesta;
import com.example.spring.service.JugarService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/jugar")
public class JugarController {
	
	@Autowired
	JugarService jugarService;
	
	@GetMapping("/pregunta")
	public ResponseEntity<Pregunta> getPreguntas(){
		return new ResponseEntity<Pregunta>(jugarService.getPregunta(), HttpStatus.OK);
	}
	
	@GetMapping("/respuestas/{id}")
    public ResponseEntity<List<Respuesta>> getRespuestas(@PathVariable(value = "id") Long id) {
        return new ResponseEntity <List<Respuesta>> (jugarService.getRespuestasIncorrectas(id), HttpStatus.OK);
    }
	
	@GetMapping("/{id_pregunta}/{id_respuestaByPregunta}")
	public ResponseEntity<Long> comprobarRespuesta(@PathVariable (value = "id_pregunta") Long id_pregunta, @PathVariable (value = "id_respuestaByPregunta") Long id_respuestaByPregunta) {
        return new ResponseEntity<Long>(jugarService.comprobarRespuesta(id_pregunta, id_respuestaByPregunta), HttpStatus.OK);
	}

}
