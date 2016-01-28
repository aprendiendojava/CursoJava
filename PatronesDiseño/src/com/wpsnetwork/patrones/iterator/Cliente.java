package com.wpsnetwork.patrones.iterator;

import com.wpsnetwork.patrones.iterator.interfaces.Iterator;

public class Cliente {
	private int codigo;
	private int edad;
	private String nombre;
	
	public Cliente (int codigo, String nombre, int edad){
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Iterator getIterator(){
		return new ClienteIterator();
	}
	
	public class ClienteIterator implements Iterator{
		private int modo;		//modo 0 : codigo
								//modo 1 : nombre
								//modo 2 : edad

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return modo < 3;
		}

		@Override
		public Object next() {
			Object valor = null;
			
			switch (modo){
			case 0:
				valor = codigo;
				break;

			case 1:
				valor = nombre;
				break;

			case 2:
				valor = edad;
				break;
				
			}
			if (this.hasNext()) modo++;
			return valor;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
