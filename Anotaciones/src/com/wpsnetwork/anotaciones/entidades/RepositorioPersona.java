package com.wpsnetwork.anotaciones.entidades;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.wpsnetwork.anotaciones.anotaciones.ValidarPersona;

public class RepositorioPersona {
	private List<Persona> personas = new ArrayList<>();
	
	public void add(Persona persona){
		if(!validaPersona(persona)){
			throw new RuntimeException ("La persona no cumple las condiciones");
		}
		// Si todo va bien
		personas.add(persona);
	}
	
	private boolean validaPersona(Persona persona){
		boolean resultado = true;
		
		Class metadato = Persona.class;
//		ValidarPersona anotacion = (ValidarPersona) metadato.getAnnotation(ValidarPersona.class);
//		
//		if(anotacion == null){
//			// no cumplimos las restricciones. Tiene que haber notacion
//			return false;
//		} else {
//			resultado = validacion(anotacion, metadato, persona);
//			return resultado;
//		}
		
		// Para varias anotaciones
		ValidarPersona[] anotaciones = (ValidarPersona[]) metadato.getAnnotationsByType(ValidarPersona.class);
		
		if(anotaciones.length == 0){
			resultado = false;
		} else {
			for(ValidarPersona a:anotaciones){
				if((resultado != false) && (!validacion (a, metadato, persona))){
					resultado = false;
				}
			}
		}
		return resultado;
	}
	
	private boolean validacion(ValidarPersona anotacion, Class metadato, Persona persona){
		boolean resultado = true;

		int min = anotacion.minCodigo();
		int max = anotacion.maxCodigo();
		
		try {
			int codigo = (int) metadato.getMethod("getCodigo").invoke(persona);
			
			if ((codigo < min || codigo > max)){
				resultado = false;
			} else {
				String patron = anotacion.patronNombre();
				String nombre = (String) metadato.getMethod("getNombre").invoke(persona);
				
				if(!Pattern.compile(patron).matcher(nombre).find()){
					resultado = false;
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
