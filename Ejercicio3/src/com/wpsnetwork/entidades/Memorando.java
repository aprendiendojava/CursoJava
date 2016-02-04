package com.wpsnetwork.entidades;

import java.util.List;

import com.wpsnetwork.interfaces.IProcesa;

public class Memorando {
	private String titulo;
	private static String[] listaArticulos;
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
		listaArticulos = new String[]{"1","2","3","4","5","6"};
		listaArticulos[4] = "Primer artículo";
		listaArticulos[1] = "Segundo artículo";
		listaArticulos[2] = "Tercero artículo";
		listaArticulos[3] = "Cuarto artículo";
		listaArticulos[0] = "Pepito";
		for(String a:listaArticulos){
			System.out.println(a);
		}
		Memorando articulo = new Memorando(6);
		articulos = articulo.articulosCon ("artículo");
		
		System.out.println("Otro bucle");
		
		for(String a:articulos){
			System.out.println(a);
		}
	}
	
	public String[] articulosQueCumplenCon (IProcesa validacion){
		String[] articulos = new String[]{"1","2","3","4","5","6"};
		int i = 0;
		for(String a:listaArticulos){
			if(validacion.valida(a)){
				articulos[i++] = a;
				
			}
		}
		// borra los siguientes
		for(;i<articulos.length;i++){
			articulos[i] = null;
		}
		
		this.listaArticulos = articulos;
		return articulos;
	}
	
	public String[] articulosCon (String texto){
		return articulosQueCumplenCon(articulo -> articulo.contains(texto));
		// articulosQueCumplenCon(articulo -> !articulo.contains(texto));
	}
	
}
