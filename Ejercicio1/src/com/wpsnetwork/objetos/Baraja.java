package com.wpsnetwork.objetos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import com.wpsnetwork.enumerados.PaloCarta;
import com.wpsnetwork.objetos.Carta;

public class Baraja {

	Vector barajaDeCartas = new Vector(40);
	
	public void iniciarJuego(){
		Vector oros = new Vector(10);
		Vector copas = new Vector(10);
		Vector espadas = new Vector(10);
		Vector bastos = new Vector(10);
		int i = 0;
		for (i=1;i<=10;i++){
        	PaloCarta palo = PaloCarta.OROS;
        	Carta carta = new Carta(i,palo);
        	bastos.addElement(carta);
		}
		Enumeration enumeracionOros = oros.elements();
        while(enumeracionOros.hasMoreElements()){
            barajaDeCartas.addElement((Carta)enumeracionOros.nextElement());
        }

		for (i=1;i<=10;i++){
        	PaloCarta palo = PaloCarta.COPAS;
        	Carta carta = new Carta(i,palo);
        	bastos.addElement(carta);
		}
		Enumeration enumeracionCopas = copas.elements();
		while(enumeracionCopas.hasMoreElements()){
        	barajaDeCartas.addElement((Carta)enumeracionCopas.nextElement());
        }

		for (i=1;i<=10;i++){
        	PaloCarta palo = PaloCarta.ESPADAS;
        	Carta carta = new Carta(i,palo);
        	bastos.addElement(carta);
		}
		Enumeration enumeracionEspadas = espadas.elements();
		while(enumeracionEspadas.hasMoreElements()){
        	barajaDeCartas.addElement((Carta)enumeracionEspadas.nextElement());
        }
		for (i=1;i<=10;i++){
        	PaloCarta palo = PaloCarta.BASTOS;
        	Carta carta = new Carta(i,palo);
        	bastos.addElement(carta);
		}
		Enumeration enumeracionBastos = bastos.elements();
        while(enumeracionBastos.hasMoreElements()){
        	barajaDeCartas.addElement((Carta)enumeracionBastos.nextElement());
        }
	}
	
	public void Baraja(){
		this.iniciarJuego();
	}
	
	public void barajar(){
		java.util.Collections.shuffle(barajaDeCartas);	// Esto las desordena aleatoriamente
	}

	public Carta reparte () {
		return (Carta)barajaDeCartas.firstElement();
	}
	
	public Mano mano (int i){
		Mano mano = new Mano();
		for (int j=0;j<i;j++){
			mano.addCarta((Carta)barajaDeCartas.get(i));
		}
		return mano;
	}
	
	@Override
	public String toString() {
		String cadena = new String ();
		for (int i=0;i<40;i++){
			cadena = cadena.concat(barajaDeCartas.get(i).toString()+", ");
			cadena = cadena.concat("\n");
		}
//		return this.barajaDeCartas.get(1).toString();
		return cadena;
	}
	
	
}
