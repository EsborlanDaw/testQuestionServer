package com.example.spring.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String alias;
	
	@OneToOne(mappedBy = "usuario")
    private Historial historial;
	
	public Usuario() {
		super();
	}
	

	public Usuario(Long id, String alias, Historial historial) {
		super();
		this.id = id;
		this.alias = alias;
		this.historial = historial;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAlias() {
		return alias;
	}


	public void setAlias (String alias) {
		this.alias = alias;
	}


	public Historial getHistorial() {
		return historial;
	}


	public void setHistorial(Historial historial) {
		this.historial = historial;
	}
	
	

	
	
}
