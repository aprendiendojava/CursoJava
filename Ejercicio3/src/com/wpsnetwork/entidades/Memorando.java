package com.wpsnetwork.entidades;

import java.util.List;

import com.wpsnetwork.interfaces.IProcesa;

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
	
	public static void main (String args[]){
		String[] articulos = new String[]{"1","2","3","4","5","6"};
		articulos[4] = "Primer artículo";
		articulos[1] = "Segundo artículo";
		articulos[2] = "Tercero artículo";
		articulos[3] = "Cuarto artículo";
		System.out.println(articulos[1]);
		System.out.println(articulosCon ("artículo")[1]);
	}
	
	public static String[] articulosQueCumplenCon (IProcesa validacion){
		String[] articulos = null;
//		for(){
//			if(){
//				
//			}
//			
//		}
		return articulos;
	}
	
	public static String[] articulosCon (String texto){
		return articulosQueCumplenCon(articulo -> articulo.contains(texto));
		// articulosQueCumplenCon(articulo -> !articulo.contains(texto));
	}
	
}
