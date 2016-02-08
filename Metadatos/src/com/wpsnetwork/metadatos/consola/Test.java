package com.wpsnetwork.metadatos.consola;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException
													, NoSuchMethodException
													, SecurityException
													, InstantiationException
													, IllegalAccessException
													, IllegalArgumentException
													, InvocationTargetException {
		/*
		 * Se usa para anotaciones
		 * Los metadatos permiten acceder a información de un objeto, como métodos o atributos y podemos hacerlo en tiempo de ejecución
		 * 
		 * Class, Method, Field
		 * Class -> Representa los datos de una clase o una interfaz. Se utiliza el nombre de la clase
		 * 
		 * Todas están en el paquete java.lang.reflect
		 * 
		 */
		
		Class metadatos = Class.forName("java.lang.StringBuffer");
		
		// Forma alternativa
		StringBuffer buffer = new StringBuffer();
		Class metadatos2 = buffer.getClass();
		
		System.out.println("metadatos2="+metadatos2);
		
		// Forma alternativa
		Class metadatos3 = StringBuffer.class;
		
		// Obtenemos el constructor.
		Constructor constructor = metadatos.getConstructor(String.class);// de todos los constructores que tiene, le decimos que nos devuelva el del String de parametro.

		// Ejecutamos el constructor. Creamos una instancia desde un String que nos han pasado, con el tipo de clase de la instancia.
		StringBuffer buffer2 = (StringBuffer) constructor.newInstance ("Cadena inicial");
		
		System.out.println("buffer2="+buffer2);
		
		
		// Acceso a una propiedad de una clase a traves de su getter
		// El Method representa los metadatos de un metodo, de una clase o interfaz.
		LocalDate fecha = LocalDate.now();
		Class metadatoFecha = fecha.getClass();
		Method metodo = metodoGet(metadatoFecha,"year");
		
		int anyo = (int) metodo.invoke(fecha);
		
		System.out.println(anyo);
		
		// La clase ClassLoader permite cargar clases. La opción getSystem devuelve ClassLoader. Permite cargar .class dinamicamente y librerias. Ademas coge el path.
		
		/*
		 * 
		 * 
		 * 
		 * Las anotaciones
		 * ===============
		 * 
		 * Compilador
		 * ----------
		 * 
		 * @Override
		 * @SuppresWarnings
		 * @Deprecated
		 * @FunctionalInterface (el compilador comprueba que solo tiene un metodo)
		 * 
		 * 
		 * Sobreviven al compilador
		 * ------------------------
		 * 
		 */
		
		
	}

	static private Method metodoGet (Class metadato, String atributo){
		Method metodo = null;
		
		String trozo = Character.toUpperCase(atributo.charAt(0)) + atributo.substring(1);
		
		try {
			
			metodo = metadato.getMethod("get"+trozo);
			// Para acceder a un metodo privado hay que usar getDeclaredMethod
			
		} catch (NoSuchMethodException e) {
			try {
				metodo = metadato.getMethod("is"+trozo);
			} catch (NoSuchMethodException e1) {
				e1.printStackTrace();
			} catch (SecurityException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		return metodo;
	}
}
