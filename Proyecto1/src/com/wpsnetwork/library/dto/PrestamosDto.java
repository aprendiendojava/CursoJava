package com.wpsnetwork.library.dto;

import com.wpsnetwork.library.dao.entidades.Prestamo;
import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dao.interfaces.Dao;
import com.wpsnetwork.library.enumerados.TipoObjeto;

public class PrestamosDto {
//	private Prestamo prestamo;
	private Dao<Prestamo> repPrestamo;
	
	

	public PrestamosDto() {
		super();
		repPrestamo = new FactoriaDao().getDao("MEMORIA", TipoObjeto.PRESTAMO);
	}

	public PrestamosDto(Dao<Prestamo> repPrestamo) {
		super();
		this.repPrestamo = repPrestamo;
	}

	@Override
	public String toString() {
		return "PrestamosDto [repPrestamo=" + repPrestamo.toString() + "]";
	}
	
	
}
