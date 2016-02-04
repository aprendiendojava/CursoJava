package com.wpsnetwork.consola;

import com.wpsnetwork.banco.Cuenta;
import com.wpsnetwork.eventos.ReceptorEvento;
import com.wpsnetwork.excepciones.CuentaNegativaException;
import com.wpsnetwork.excepciones.NumeroNoValidoException;

public class Test {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta("Cuenta0", "Cuenta0", 50);
		
		System.out.println("Cantidad al principio="+cuenta.getCantidad());
		
		try{
			cuenta.sumaCantidad((double)20);
		} catch(NumeroNoValidoException | CuentaNegativaException e){
			System.out.println("Algo ha salido mal: "+((Throwable) e).getLocalizedMessage());
		}

		System.out.println("Cantidad a la mitad="+cuenta.getCantidad());
		
		try{
			cuenta.restaCantidad((double)21);
		} catch(NumeroNoValidoException | CuentaNegativaException e){
			System.out.println("Algo ha salido mal: "+((Throwable) e).getLocalizedMessage());
		}
			
		System.out.println("Cantidad al final="+cuenta.getCantidad());
	}

}
