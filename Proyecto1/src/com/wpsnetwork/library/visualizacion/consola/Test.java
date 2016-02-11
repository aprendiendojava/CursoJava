package com.wpsnetwork.library.visualizacion.consola;

import org.apache.log4j.Logger;

import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dto.AutoresDto;
import com.wpsnetwork.library.dto.CategoriasDto;
import com.wpsnetwork.library.dto.LibrosDto;
import com.wpsnetwork.library.dto.PersonasDto;
import com.wpsnetwork.library.dto.PrestamosDto;
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
		
		AutoresDto repAutores = new AutoresDto();
		LibrosDto repLibros = new LibrosDto();
		CategoriasDto repCategorias = new CategoriasDto();
		PersonasDto repPersonas = new PersonasDto();
		PrestamosDto repPrestamos = new PrestamosDto();

		System.out.println("Autores: "+repAutores.toString());
		System.out.println("Libros: "+repLibros.toString());
//		System.out.println("Libros: "+repoLibrosAutores.toString());
		System.out.println("Categorías: "+repCategorias.toString());
		System.out.println("Personas: "+repPersonas.toString());
		System.out.println("Prestamos: "+repPrestamos.toString());
		
		//patata
	}
}