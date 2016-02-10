package com.wpsnetwork.library.dao.entidades;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {
	private int id;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private char devuelto;
	private int libro;
	private int persona;
	
	public Prestamo() {
		super();
	}
	public Prestamo(int id, LocalDate fechaInicio, LocalDate fechaFin, char devuelto, int libro, int persona) {
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
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
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
	@Override
	public String toString() {
		return "\nPrestamo [id=" + id + "\n"
			+ "	fechaInicio=" + fechaInicio.toString().replace("-", "/") + "\n"
			+ "	fechaFin=" + fechaFin.toString().replace("-", "/") + "\n"
			+ "	devuelto="+ devuelto + "\n"
			+ "	libro=" + libro + "\n"
			+ "	persona=" + persona + "]";
	}
	
}
