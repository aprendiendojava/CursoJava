package com.wpsnetwork.dao.entidades;

import java.util.Date;
import java.util.List;

public class Persona {
	private int id;
	private String nombre;
	private String dni;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	private String pais;
	private String provincia;
	private String codPostal;
	private List<Prestamo> prestamos;
	
	public Persona() {
		super();
	}
	public Persona(int id, String nombre, String dni, Date fechaNacimiento, String direccion, String telefono,
			String pais, String provincia, String codPostal, List<Prestamo> prestamos) {
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
		this.prestamos = prestamos;
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
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
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
}
