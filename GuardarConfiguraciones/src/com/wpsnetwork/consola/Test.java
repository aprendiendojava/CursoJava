package com.wpsnetwork.consola;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.prefs.Preferences;

public class Test {
	public static void main (String[] args){
		// Propiedades del sistema
		System.out.println(System.getProperties().toString().replace(", ","\n" ));

		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("user.language"));
		
		// Finalizar la aplicación
//		System.exit(0);
//		System.out.println("Esto no se escribe si lo de arriba está descomentado");
		
		// ----------------------------
		// Muy importante!!!
		// Ficheros de configuración!!!!!
		// ----------------------------
		// Sirve para guardar propiedades de una aplicación entre un uso y otro (personalización, nivel de una partida, etc). 
		// Se usa mucho para guardar cadenas de texto, sobre todo para los idiomas.
		Properties configuracion = new Properties();
		try {
			configuracion.load(new FileReader("src/com/wpsnetwork/propiedades/configuracion.properties"));

			System.out.println(configuracion);
			System.out.println(configuracion.getProperty("usuario"));
	
			configuracion.setProperty("idioma", "es");		// lo guardo en memoria
			
			configuracion.store(new FileWriter("src/com/wpsnetwork/propiedades/configuracion.properties"), "comentario del fichero de configuración"); // guardo en fichero
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {		// permisos, archivo abierto, error al guardar...
			e.printStackTrace();
		}

		// ---------------------------
		// Configuraciones de programa
		// ---------------------------
		
		// Esto escribirá en el registro de windows, dentro de la carpeta que comento abajo
		// propiedades del programa que yo le diga que registre
		Preferences registroWindowsUsuario = Preferences.userRoot();
				// HKEY_CURRENT_USER/Software/JavaSoft/prefs
				// Solo para este usuario.
		registroWindowsUsuario = registroWindowsUsuario.node("com/wpsnetwork/preferencias"); // navega al nodo del registro
		registroWindowsUsuario.put("usuario", "Menganito");									// escribe en registro
		
		System.out.println(registroWindowsUsuario.get("usuario", "Valor por defecto si no lo encuentra"));
		
		Preferences registroWindowsSistema = Preferences.systemRoot();
				// 32bits --> HKEY_LOCAL_MACHINE/SOFTWARE/JavaSoft/Prefs
				// 64bits --> HKEY_LOCAL_MACHINE/SOFTWARE/Wow6432Node/JavaSoft/Prefs
		
		registroWindowsSistema = registroWindowsSistema.node("com/wpsnetwork/preferencias");	// navega al nodo del registro
		registroWindowsSistema.put("conguracionACR", "loquemedalagana");			// escribe en registro
	
	
		// Obtener la MV de Java
		// ----------------------
		
		Runtime mv = Runtime.getRuntime();
		
		//Ejecutar una aplicación externa
		try{
			Process p = mv.exec("calc.exe");
			p.destroy();//finaliza la aplicación ejecutada
			
			System.out.println("Memoria total de la mv="+mv.totalMemory()+" bytes\n"
								+"Memoria libre="+mv.freeMemory()+" bytes.");
		} catch(IOException e){
			e.printStackTrace();
		}

	}
	
}
