package com.wpsnetwork.library.visualizacion.consola;

import org.apache.log4j.Logger;

import com.wpsnetwork.library.dao.entidades.Autor;
import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioCategoriasMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioLibrosAutoresMemoriaDao;
import com.wpsnetwork.library.dao.memoria.RepositorioLibrosMemoriaDao;
import com.wpsnetwork.library.enumerados.TipoObjeto;

public class Test {
 
	// Porqué? Porque eso pone en "http://www.javatutoriales.com/2011/04/log4j-para-creacion-de-eventos-de-log.html"
	private static Logger log = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		/**
		 * Ejemplo de internet 
		 */
		/**
		Logger logger = Logger.getLogger(Test.class);
		logger.trace("Ejemplo de traza");
		try {
			int a = 1/0;
			System.out.println(a);
		} catch (Exception e) {
			logger.error(e);
		}
		*/
		
		
		/**
		 * 
		 *  Ejemplo mio
		 * 
		 * Vamos a diferenciar los distintos tipos de traza/error fatal.
		 * 
		 * 
		 */
//	    log.trace("mensaje de trace");
//	    log.debug("mensaje de debug");
//	    log.info("mensaje de info");
//	    log.warn("mensaje de warn");
//	    log.error("mensaje de error");
//	    log.fatal("mensaje de fatal");
		
		RepositorioAutoresMemoriaDao repoAutores =
				(RepositorioAutoresMemoriaDao) new FactoriaDao().getDao("MEMORIA", TipoObjeto.AUTOR);
		RepositorioLibrosMemoriaDao repoLibros =
				(RepositorioLibrosMemoriaDao) new FactoriaDao().getDao("MEMORIA", TipoObjeto.LIBRO);
		RepositorioLibrosAutoresMemoriaDao repoLibrosAutores =
				(RepositorioLibrosAutoresMemoriaDao) new FactoriaDao().getDao("MEMORIA", TipoObjeto.LIBROSAUTORES);
		RepositorioCategoriasMemoriaDao repoCategorias =
				(RepositorioCategoriasMemoriaDao) new FactoriaDao().getDao("MEMORIA", TipoObjeto.CATEGORIA);

		System.out.println("Autores: "+repoAutores.toString());
		System.out.println("Libros: "+repoLibros.toString());
		System.out.println("Libros: "+repoLibrosAutores.toString());
		System.out.println("Categorías: "+repoCategorias.toString());
	}
}