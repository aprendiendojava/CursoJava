package com.wpsnetwork.consola;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println(2.0);	// Si mostramos un n�mero, es sin formato de idioma.
		
		// Leer con formato en funci�n del idioma
		Scanner scanner = new Scanner ("83,25");		// Lee bien (si le pongo un punto peta porque busca la coma del espa�ol)
		System.out.println(scanner.nextDouble());
		
		Scanner scannerIngles = new Scanner("22.34");	// Si le pongo una coma peta, porque busca el punto del formato ingl�s
		scannerIngles.useLocale(Locale.ENGLISH);		// Especificamos el idioma del Scanner.
		System.out.println(scannerIngles.nextDouble());
		
		// Leemos el fichero de propiedades
		Properties propiedades = new Properties();
		
		try {
			propiedades.load(new FileReader("src/com/wpsnetwork/propiedades/aplicacion.properties"));		// el origen est� antes del src/
			
			Locale.setDefault(new Locale(propiedades.getProperty("idioma"),		// Cambiamos el idioma MV
											propiedades.getProperty("pais")));
			
			ResourceBundle recursos = PropertyResourceBundle.getBundle("textos/internacionalizacion");		// el origen empieza despu�s de src/

			System.out.println(recursos.getString("texto1"));
			System.out.println(recursos.getString("texto2"));
			System.out.println(recursos.getString("texto3"));
			System.out.println(recursos.getString("texto4"));
//			System.out.println(recursos.getString("texto5"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Mostrar n�meros con formato de idioma
		System.out.printf("%.2f\n", 2.3);			// Al cambiar la m�quina virtual a espa�ol, nos lo muestra con la coma (printf). Hay que poner el salto de l�nea.
		
		String valor = String.format("%.2f", 5.67);
		System.out.println(valor);
		
	}

}
