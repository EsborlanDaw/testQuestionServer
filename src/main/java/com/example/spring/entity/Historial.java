package com.example.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "historial")
public class Historial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int jugadas;
	private int victorias;
	private int derrotas;
	
	@OneToOne
    @JoinColumn(name = "idUsuario")
	 private Usuario usuario;
	
	

	public Historial() {
		super();
	}

	public Historial(Long id, int jugadas, int victorias, int derrotas, Usuario usuario) {
		super();
		this.id = id;
		this.jugadas = jugadas;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getJugadas() {
		return jugadas;
	}

	public void setJugadas(int jugadas) {
		this.jugadas = jugadas;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
