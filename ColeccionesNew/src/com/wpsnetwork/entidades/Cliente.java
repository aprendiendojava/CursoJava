package com.wpsnetwork.entidades;

public class Cliente implements Comparable<Cliente>, Cloneable {
	private int codigo;
	private String nombre;
	private int edad;
	
	public Cliente() {
		super();
	}
	public Cliente(int codigo, String nombre, int edad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
	}
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	@Override
	public int compareTo(Cliente o) {
		// Esta es una forma
		/*
		int retorno = 0;
		
		if(this.codigo > o.codigo) retorno = 1;
		else if(this.codigo < o.codigo) retorno = -1;
		
		return retorno;
		*/
		// También se puede hacer de esta forma
//		return Integer.compare(this.codigo, o.codigo);
		return this.nombre.compareTo(o.nombre);

	}
	@Override
	public int hashCode() {
		// Se multiplica por un número para ver si luego coincide con el otro código, que se multiplicará por el mismo número
		return codigo*5;
	}
	@Override
	public boolean equals(Object obj) {
		return this.codigo == ((Cliente) obj).codigo;
	}
//	Para usar este método tendríamos que definirlo nosotros. Para utilizarlo sin tener que definirlo, tenemos que implementar Cloneable
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
//	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
