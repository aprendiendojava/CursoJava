package com.wpsnetwork.anotaciones.anotaciones;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
										
										//Donde se puede poner la anotacion
@Target ({ElementType.FIELD,			// Propiedad
			ElementType.METHOD,			// Metodo
			ElementType.TYPE})			// Clase

@Retention(RetentionPolicy.RUNTIME)
			/*
			 * Tenemos 3 posibles valores
			 * 	- CLASS -> Valor por defecto. Se guarda en los .class, pero no estan disponibles en tiempo de ejecucion
			 * 	- RUNTIME -> Accesibles en tiempo de ejecución
			 * 	- SOURCE -> Eliminados por el compilador (no estan en los .class) 
			 * */

@Inherited	/* Esta disponible para el objeto donde se coloca y sus subclases. Por defecto la anotacion no se hereda
			*/

@Documented	// Para que se añada la documentación de javadoc

public @interface Descripcion {
	String value();
	
}
