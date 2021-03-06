package com.wpsnetwork.library.dao.entidades;

import java.time.LocalDate;
import java.util.List;

public class Persona {
	private int id;
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;
	private String direccion;
	private String telefono;
	private String pais;
	private String provincia;
	private String codPostal;
	
	public Persona() {
		super();
	}
	public Persona(int id, String nombre, String dni, LocalDate fechaNacimiento, String direccion, String telefono,
			String pais, String provincia, String codPostal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.pais = pais;
		this.provincia = provincia;
		this.codPostal = codPostal;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id || dni != other.dni)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nPersona [id=" + id + "\n"
				+ "	nombre=" + nombre + "\n"
				+ "	dni=" + dni + "\n"
				+ "	fechaNacimiento=" + fechaNacimiento.toString().replace("-", "/") + "\n"
				+ "	direccion=" + direccion + "\n"
				+ "	telefono=" + telefono + "\n"
				+ "	pais=" + pais + "\n"
				+ "	provincia=" + provincia + "\n"
				+ "	codPostal=" + codPostal + "]";
	}


}
