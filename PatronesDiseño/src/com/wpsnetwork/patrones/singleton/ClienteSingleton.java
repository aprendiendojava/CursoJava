package com.wpsnetwork.patrones.singleton;

public class ClienteSingleton {
	private ClienteSingleton instancia = new ClienteSingleton();
	// esto es para que cuando instanciemos una clase, nos devuelva siempre la misma. La primera vez se crea
	private ClienteSingleton(){
		super();
	}
	
	public ClienteSingleton getInstance(){
		
	}
}
