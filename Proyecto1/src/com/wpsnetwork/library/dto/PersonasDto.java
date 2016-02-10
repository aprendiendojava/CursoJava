package com.wpsnetwork.library.dto;

import com.wpsnetwork.library.dto.entidades.Persona;
import com.wpsnetwork.library.enumerados.TipoObjeto;
import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class PersonasDto {
//	private Persona persona;
	private Dao<Persona> repPersona;
	
	public PersonasDto() {
		super();
		repPersona = (Dao<Persona>) new FactoriaDao().getDao("MEMORIA", TipoObjeto.PERSONA);
	}

	public PersonasDto(Dao<Persona> repPersona) {
		super();
		this.repPersona = repPersona;
	}

	@Override
	public String toString() {
		return "PersonasDto [repPersona=" + repPersona.toString() + "]";
	}
	
	
}
