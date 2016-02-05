package com.wpsnetwork.dto.entidades;

import java.util.List;

public class Categoria {
	private int id;
	private String nombre;
	private List<Libro> libros;
	
	public Categoria() {
		super();
	}
	public Categoria(int id, String nombre, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.libros = libros;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

}
