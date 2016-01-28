package com.wpsnetwork.consola;

import java.security.AccessControlException;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Main {

	public static void main(String[] args) {
		/*
		
		try{		// Mira los ejemplos del try con par�metros (abrir fichero por ejemplo)
			int x = 10/0;	// Es de tipo RuntimeException
			System.out.println("Se ejecuta despu�s de la divisi�n");

		}
		catch (ArithmeticException | AccessControlException e){		// puedes poner varias excepciones separadas por el pipe |
			System.out.println("Error: Divisi�n por cero");
			System.out.println(e.getMessage());
//			System.out.println(e.getStackTrace().toString().toString());		// pinta un hash aqu�, porqu�??
			e.printStackTrace();
			
			// Si ponemos un return aqui, primero ejecuta el finally, y luego el return.
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("Dentro del catch 2");
		}
		catch (Exception e){
			// Es el error mas general y si lo pusi�ramos arriba se lo comer�a todo, es decir, cualquier excepci�n entrar�a por aqu�.
			// Al ponerlo aqu� abajo entran todas las que no han entrado por arriba.
			System.out.println("Cualquier otra excepci�n");
		}
		finally{
			System.out.println("C�digo que se ejecuta tanto si hay error como si no.");
			// por ejemplo, cerrar un fichero, que queremos cerrarlo tanto si peta como si no...
		}
		
		System.out.println("Sigue ejecutando la aplicaci�n");
		
		*/
		boolean continuar = true;
		int opcion;
		do{
			continuar = false;
			//Mostramos el menu
			System.out.println("1.-Opci�n 1");
			System.out.println("2.-Opci�n 2");
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
		// aqu� tambi�n se puede tratar que s�lo sean enteros.
		int valor = Integer.parseInt(linea);
		
		if(valor < 0 || valor > 2){
			throw new NumeroNoValidoException("La opci�n no es v�lida.");
		}
		return valor;
	}

}

