package com.wpsnetwork.anotaciones.consola;

import java.lang.reflect.Field;

import com.wpsnetwork.anotaciones.anotaciones.Descripcion;
import com.wpsnetwork.anotaciones.entidades.RepositorioPersona;
import com.wpsnetwork.anotaciones.entidades.Persona;

public class Test {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Class metadato = Persona.class;
		
		Field codigo = metadato.getDeclaredField("codigo");
		
		// Accedemos a las anotaciones de la propiedad privada
		Descripcion anotacion = codigo.getAnnotation(Descripcion.class);
		
		// Contenido de la propiedad value de la anotacion
		System.out.println("Anotacion="+anotacion.value());

		
		Persona p1 = new Persona(101, "9epito");
		RepositorioPersona repositorio = new RepositorioPersona();
		repositorio.add(p1);
		
		Persona p2 = new Persona(6, "Pepito");
		RepositorioPersona repositorio2 = new RepositorioPersona();
		repositorio2.add(p2);
	}

}
