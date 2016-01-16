package com.wpsnetwork.entidades;

import com.wpsnetwork.entidades.enumerados.TipoTriangulo;

public final class Triangulo extends Figura {		// polimorfismo!!!!!!!!!!!!!!

	private int base;
	private int altura;
	private TipoTriangulo tipo;

	public Triangulo(int x, int y, int base, int altura, TipoTriangulo tipo) {
		super(x, y);
		this.base = base;
		this.altura = altura;
		this.tipo = tipo;
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return (base*altura)/2;
	}

	@Override
	public String toString() {
		return "Triangulo [PosiciónX()="+getX()+", PosiciónY()="+getY()+", base="+base+", altura="+altura+"]";
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
}
