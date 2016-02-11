package com.wpsnetwork.library.dto.entidades;

import java.util.List;

public class Libro {
	private int id;
	private String titulo;
	private int paginas;
	private String editorial;
	private int edicion;
	private List<Autor> autores;
	private List<Categoria> categorias;

	public Libro() {
		super();
	}
	
	public Libro(int id, String titulo, int paginas, String editorial, int edicion, List<Autor> autores,
			List<Categoria> categorias) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.paginas = paginas;
		this.editorial = editorial;
		this.edicion = edicion;
		this.autores = autores;
		this.categorias = categorias;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
}
