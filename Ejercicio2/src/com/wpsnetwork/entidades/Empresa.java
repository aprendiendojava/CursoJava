package com.wpsnetwork.entidades;

public class Empresa extends Inquilino{

	private String cif;
	
	public Empresa(String nombreCompleto) {
		super(nombreCompleto);
	}

	@Override
	public String toString() {
		return "Empresa [cif=" + cif + "]";
	}
}
