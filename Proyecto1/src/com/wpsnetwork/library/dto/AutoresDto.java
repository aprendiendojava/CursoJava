package com.wpsnetwork.library.dto;

import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dao.interfaces.Dao;
import com.wpsnetwork.library.dto.entidades.Autor;
import com.wpsnetwork.library.enumerados.TipoObjeto;

public class AutoresDto {
//	private Autor autorDto = new Autor();
//	private List<Libro> libros;
	
	private Dao<Autor> repAutor;

	public AutoresDto() {
		super();
		this.repAutor = (Dao<Autor>) new FactoriaDao().getDao("MEMORIA", TipoObjeto.AUTOR);
	}

	public AutoresDto(Dao<Autor> repAutor) {
		super();
		this.repAutor = repAutor;
	}

	@Override
	public String toString() {
		return "AutoresDto [repAutor=" + repAutor.toString() + "]";
	}


}
