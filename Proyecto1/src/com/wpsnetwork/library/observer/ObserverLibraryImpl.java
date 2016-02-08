package com.wpsnetwork.library.observer;

import org.apache.log4j.Logger;

public class ObserverLibraryImpl implements ObserverLibrary {

	@Override
	public void mensaje(Logger log) {
		log.info("Estamos en el ObserverLibraryImpl");
	}
}
