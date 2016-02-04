package com.wpsnetwork.dao.factorias;

import com.wpsnetwork.dao.interfaces.Dao;
import com.wpsnetwork.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioCategoriasLibrosMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioLibrosMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioPersonasMemoriaDao;
import com.wpsnetwork.dao.memoria.RepositorioPrestamosMemoriaDao;
import com.wpsnetwork.enumerados.TipoObjeto;

public class FactoriaDao {

	public static Dao getDao(String tipoAcceso, TipoObjeto tipoObjeto){
		
		Dao repositorio;
		if(tipoAcceso == "MEMORIA"){
			
			switch(tipoObjeto){
			case AUTOR:
				repositorio = new RepositorioAutoresMemoriaDao();
				break;
			case LIBRO:
				repositorio = new RepositorioLibrosMemoriaDao();
				break;
			case CATEGORIALIBRO:
				repositorio = new RepositorioCategoriasLibrosMemoriaDao();
				break;
			case PRESTAMO:
				repositorio = new RepositorioPrestamosMemoriaDao();
				break;
	//		case PERSONA:
			default:
				repositorio = new RepositorioPersonasMemoriaDao();
				break;
			}
			
		} else{
			// por ahora pongo esto, mientras que se definan los otros tipos de accesos.
			repositorio = new RepositorioPersonasMemoriaDao();
		}
		return repositorio;
	}
}
