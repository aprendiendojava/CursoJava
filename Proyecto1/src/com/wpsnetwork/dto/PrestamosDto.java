package com.wpsnetwork.dto;

import com.wpsnetwork.dao.entidades.Prestamo;
import com.wpsnetwork.dao.memoria.RepositorioPrestamosMemoriaDao;
import com.wpsnetwork.dto.entidades.Libro;
import com.wpsnetwork.dto.entidades.Persona;

public class PrestamosDto {
	private Prestamo prestamo;
	private Libro libro;
	private Persona persona;

	public PrestamosDto(RepositorioPrestamosMemoriaDao repPrestamo) {
		super();
	}
}
