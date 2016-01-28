package com.wpsnetwork.consola;

import java.security.AccessControlException;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Main {

	public static void main(String[] args) {
		/*
		
		try{		// Mira los ejemplos del try con parámetros (abrir fichero por ejemplo)
			int x = 10/0;	// Es de tipo RuntimeException
			System.out.println("Se ejecuta después de la división");

		}
		catch (ArithmeticException | AccessControlException e){		// puedes poner varias excepciones separadas por el pipe |
			System.out.println("Error: División por cero");
			System.out.println(e.getMessage());
//			System.out.println(e.getStackTrace().toString().toString());		// pinta un hash aquí, porqué??
			e.printStackTrace();
			
			// Si ponemos un return aqui, primero ejecuta el finally, y luego el return.
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("Dentro del catch 2");
		}
		catch (Exception e){
			// Es el error mas general y si lo pusiéramos arriba se lo comería todo, es decir, cualquier excepción entraría por aquí.
			// Al ponerlo aquí abajo entran todas las que no han entrado por arriba.
			System.out.println("Cualquier otra excepción");
		}
		finally{
			System.out.println("Código que se ejecuta tanto si hay error como si no.");
			// por ejemplo, cerrar un fichero, que queremos cerrarlo tanto si peta como si no...
		}
		
		System.out.println("Sigue ejecutando la aplicación");
		
		*/
		boolean continuar = true;
		int opcion;
		do{
			continuar = false;
			//Mostramos el menu
			System.out.println("1.-Opción 1");
			System.out.println("2.-Opción 2");
			System.out.println("0.-Salir");
			try{
				opcion = leerTeclado();
			} catch(NumeroNoValidoException e){
				continuar = true;
				System.out.println("Vuelve a preguntar");
			}
			
		} while (continuar);
		
		System.out.println("Hemos salido");
	}
	
	private static int leerTeclado () throws NumeroNoValidoException{
		Scanner teclado = new Scanner(System.in);
		String linea = teclado.nextLine();
		// aquí también se puede tratar que sólo sean enteros.
		int valor = Integer.parseInt(linea);
		
		if(valor < 0 || valor > 2){
			throw new NumeroNoValidoException("La opción no es válida.");
		}
		return valor;
	}

}

