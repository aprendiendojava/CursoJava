package com.wpsnetwork.library.dao.entidades;

public class Categoria {
	private int id;
	private String nombre;
	public Categoria() {
		super();
	}
	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "\nCategoria [	id=" + id + "\n"
				+ "	nombre=" + nombre + "]";
	}
}
