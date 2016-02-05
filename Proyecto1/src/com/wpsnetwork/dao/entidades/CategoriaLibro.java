package com.wpsnetwork.dao.entidades;

public class CategoriaLibro {
	private int id;
	private int categoria;
	private int libro;
	
	public CategoriaLibro() {
		super();
	}
	public CategoriaLibro(int id, int categria, int libro) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.libro = libro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getLibro() {
		return libro;
	}
	public void setNombre(int libro) {
		this.libro = libro;
	}
	
}
