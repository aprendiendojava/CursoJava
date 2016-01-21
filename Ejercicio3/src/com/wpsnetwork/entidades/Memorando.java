package com.wpsnetwork.entidades;

import java.util.List;

public class Memorando {
	private String titulo;
	private String[] listaArticulos;
//	private static final int CAPACIDAD = 10;
	private int numArticulos;

	

	//HACERLO CON EXPRESIONES LAMBDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//HACERLO CON EXPRESIONES LAMBDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//HACERLO CON EXPRESIONES LAMBDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//HACERLO CON EXPRESIONES LAMBDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getArticulo() {
		int i = 0;
		return i;
	}
	public void setListaArticulos(String[] listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
	public Memorando(String titulo, int numArticulos) {
		super();
		this.titulo = titulo;
		this.numArticulos = numArticulos;
	}
	public Memorando(int numArticulos) {
		super();
		this.titulo = "";
		this.numArticulos = numArticulos;
	}
	public int getNumArticulos() {
		return numArticulos;
	}
	
	public String[] articulosQueCumplenCon (String cond){
		String[] articulos = null;
		return articulos;
	}
	
}
