package com.wpsnetwork.library.dao.factorias;

import com.wpsnetwork.library.dao.interfaces.Dao;
import com.wpsnetwork.library.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioCategoriasLibrosMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioCategoriasMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioLibrosAutoresMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioLibrosMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioPersonasMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioPrestamosMemoriaDao;
import com.wpsnetwork.library.enumerados.TipoObjeto;

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
			case LIBROSAUTORES:
				repositorio = new RepositorioLibrosAutoresMemoriaDao();
				break;
			case CATEGORIA:
				repositorio = new RepositorioCategoriasMemoriaDao();
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
