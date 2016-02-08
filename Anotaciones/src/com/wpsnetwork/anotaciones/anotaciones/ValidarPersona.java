package com.wpsnetwork.anotaciones.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
		ElementType.TYPE				//Solo en las clases
})
@Retention(RetentionPolicy.RUNTIME)		// Accesible en tiempo de ejecución
@Repeatable(ValidacionesPersona.class)	//Donde almacenar la lista de aplicaciones de este tipo
										//Para permitir usar mas de una vez esta anotacion
										//Es el atributo y sus getters y sus setters
public @interface ValidarPersona {
	int minCodigo() default 1;
	int maxCodigo();
	String patronNombre();
}
