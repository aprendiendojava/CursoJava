package com.wpsnetwork.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Alquiler {
	private Date fechaContrato;
	private Inquilino inqui;
	private Piso piso;
	private final static double IVA = 21;
	
	private static ArrayList<Alquiler> listaAlquileres;
	
	public Alquiler() {
		super();
		this.listaAlquileres = new ArrayList();
	}

	public Alquiler(Date fechaContrato, Inquilino inqui, Piso piso) {
		super();
		this.fechaContrato = fechaContrato;
		this.inqui = inqui;
		this.piso = piso;
	}

	public double getPrecioAlquiler(){
		return (this.piso.getPrecio() * ((this.IVA/100)+1)) - (this.piso.getPrecio() * this.getDescuento()/100);
	}
	
	public static ArrayList getListaAlquileres() {
		return listaAlquileres;
	}

	public static void setListaAlquileres(ArrayList listaAlquileres) {
		Alquiler.listaAlquileres = listaAlquileres;
	}

	public static void addAlquiler (Alquiler alquiler){
		listaAlquileres.add(alquiler);
	}
	
	public Date getFechaContrato() {
		return fechaContrato;
	}

	public Inquilino getInqui() {
		return inqui;
	}

	public Piso getPiso() {
		return piso;
	}

	public double getIvaActual() {
		return this.IVA;
	}
	
	public double getDescuento (){
		double descuento = 0;
		if (this.inqui instanceof Empresa) {
			descuento = 1;
		}
		return descuento;
	}
	@Override
	public String toString() {
		return "Alquiler [PrecioAlquiler="+getPrecioAlquiler()+", Descuento="+getDescuento()+", FechaContrato="+getFechaContrato()
				+ ", Inquilino=" + getInqui() + ", Piso=" + getPiso() + ", getIvaActual()=" + getIvaActual()
				+ "]";
	}

}
