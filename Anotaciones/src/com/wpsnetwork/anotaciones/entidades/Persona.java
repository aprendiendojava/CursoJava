package com.wpsnetwork.anotaciones.entidades;

import com.wpsnetwork.anotaciones.anotaciones.Descripcion;
import com.wpsnetwork.anotaciones.anotaciones.ValidarPersona;

@Descripcion("Representa una persona")
@ValidarPersona(minCodigo = 1, maxCodigo = 100, patronNombre = "\\A(([A-ZÑ])(\\p{Lower}+))")
@ValidarPersona(minCodigo = 7, maxCodigo = 100, patronNombre = ".*")
public class Persona {
	@Descripcion("Codigo de la persona")
	private int codigo;
	@Descripcion("Nombre de la persona")
	private String nombre;
	
	public Persona(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	@Descripcion("Getter del código")
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
