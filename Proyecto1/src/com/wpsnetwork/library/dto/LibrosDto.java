package com.wpsnetwork.library.dto;

import com.wpsnetwork.library.dto.entidades.Libro;
import com.wpsnetwork.library.enumerados.TipoObjeto;
import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class LibrosDto {
//	private Libro librosDto;
	private Dao<Libro> librosDto;

	public LibrosDto() {
		super();
		this.librosDto = (Dao<Libro>) new FactoriaDao().getDao("MEMORIA", TipoObjeto.LIBRO);
	}
	public LibrosDto(Dao<Libro> repLibro) {
		super();
		this.librosDto = repLibro;
	}
	@Override
	public String toString() {
		return "LibrosDto [librosDto=" + librosDto.toString() + "]";
	}
	
	
}
