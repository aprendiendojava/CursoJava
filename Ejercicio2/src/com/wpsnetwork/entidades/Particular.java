package com.wpsnetwork.entidades;

public class Particular extends Inquilino{

	private String nif;
	
	public Particular(String nombreCompleto, String nif) {
		super(nombreCompleto);
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Particular [nif=" + nif + "]";
	}
}
