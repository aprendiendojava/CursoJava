package com.wpsnetwork.consola;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws URISyntaxException {
		// Path -> representa una ruta (equivalente a File).
		
		Path pathUri = Paths.get(new URI("file:///temp/fichero1.txt"));
		Path path = Paths.get("c:/temp/fichero1.txt", "fichero1.txt");

		Path carpeta = Paths.get("c:/temp");
		Path fichero = Paths.get("c:/temp/fichero1.txt");
		
		System.out.println(carpeta.relativize(fichero));		// Obtiene la ruta relativa respecto a un sitio.
		
		
		// Obtener la ruta absoluta, combinando dos path
		carpeta = Paths.get("c:/temp");
		fichero = Paths.get("fichero1.txt");
		
		System.out.println(carpeta.resolve(fichero));		// Obtiene la ruta relativa respecto a un sitio.
		
		//Para operar usamoos la clase Files
		
		try {
			Files.createDirectory(carpeta);
			Files.createFile(carpeta.resolve(fichero));
			
			Files.copy(carpeta.resolve(fichero), carpeta.resolve(Paths.get("fichero2.txt")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
