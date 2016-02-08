package com.wpsnetwork.library.dao.entidades;

import java.util.Date;
import java.util.List;

public class Prestamo {
	private int id;
	private Date fechaInicio;
	private Date fechaFin;
	private char devuelto;
	private int libro;
	private int persona;
	
	public Prestamo() {
		super();
	}
	public Prestamo(int id, Date fechaInicio, Date fechaFin, char devuelto, int libro, int persona) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.devuelto = devuelto;
		this.libro = libro;
		this.persona = persona;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public char getDevuelto() {
		return devuelto;
	}
	public void setDevuelto(char devuelto) {
		this.devuelto = devuelto;
	}
	public int getLibro() {
		return libro;
	}
	public void setLibro(int libro) {
		this.libro = libro;
	}
	public int getPersona() {
		return persona;
	}
	public void setPersona(int persona) {
		this.persona = persona;
	}
	
}
