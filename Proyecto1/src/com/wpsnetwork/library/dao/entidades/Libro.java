package com.wpsnetwork.library.dao.entidades;

public class Libro {
	private int id;
	private String titulo;
	private int paginas;
	private String editorial;
	private int edicion;
	
	public Libro() {
		super();
	}
	
	public Libro(int id, String titulo, int paginas, String editorial, int edicion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.paginas = paginas;
		this.editorial = editorial;
		this.edicion = edicion;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nLibro [	id=" + id + "\n"
				+ "	titulo=" + titulo + "\n"
				+ "	paginas=" + paginas + "\n"
				+ "	editorial=" + editorial+ "\n"
				+ "	edicion=" + edicion + "]";
	}
	
	
}
