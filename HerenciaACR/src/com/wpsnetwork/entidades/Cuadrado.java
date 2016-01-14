package com.wpsnetwork.entidades;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(int x, int y, int lado) {
		super(x, y, lado, lado);
	}

	@Override
	public void setBase(int base) {
		super.setAltura(base);
		super.setBase(base);
	}
	@Override
	public void setAltura(int altura) {
		super.setAltura(altura);
		super.setBase(altura);
	}
	
	
}
