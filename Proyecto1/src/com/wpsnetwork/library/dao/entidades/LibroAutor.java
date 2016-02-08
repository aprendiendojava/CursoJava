package com.wpsnetwork.library.dao.entidades;

public class LibroAutor {
	private int id;
	private int libro;
	private int autor;
	
	public LibroAutor() {
		super();
	}
	public LibroAutor(int id, int libro, int autor) {
		super();
		this.id = id;
		this.libro = libro;
		this.autor = autor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLibro() {
		return libro;
	}
	public void setLibro(int libro) {
		this.libro = libro;
	}
	public int getAutor() {
		return autor;
	}
	public void setAutor(int autor) {
		this.autor = autor;
	}
	
	
}
