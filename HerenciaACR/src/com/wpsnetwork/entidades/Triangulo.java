package com.wpsnetwork.entidades;

public final class Triangulo extends Figura {		// polimorfismo!!!!!!!!!!!!!!

	private int base;
	private int altura;

	public Triangulo(int x, int y, int base, int altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
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
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
}
