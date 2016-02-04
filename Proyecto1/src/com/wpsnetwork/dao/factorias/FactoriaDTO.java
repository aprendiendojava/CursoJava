package com.wpsnetwork.dao.factorias;

import com.wpsnetwork.dao.interfaces.Dao;
import com.wpsnetwork.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioCategoriasLibrosMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioLibrosMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioPersonasMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioPrestamosMemoriaDao;
import com.wpsnetwork.dto.AutoresDto;
import com.wpsnetwork.enumerados.TipoObjeto;

public class FactoriaDTO {
	static public Dao getDao(String tipoAcceso, TipoObjeto tipoObjeto){
		Dao repo = null;
		
		switch(tipoObjeto){
		case AUTOR:
			repo = new AutoresDto(tipoAcceso);
			break;
		case LIBRO:
			repo = new RepositorioLibrosMemoriaDao();
			break;
		case CATEGORIALIBRO:
			repo = new RepositorioCategoriasLibrosMemoriaDao();
			break;
		case PRESTAMO:
			repo = new RepositorioPrestamosMemoriaDao();
			break;
//		case PERSONA:
		default:
			repo = new RepositorioPersonasMemoriaDao();
			break;
		}
		return repo;
	}
}
