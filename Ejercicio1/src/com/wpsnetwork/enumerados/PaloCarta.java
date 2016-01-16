package com.wpsnetwork.enumerados;

public enum PaloCarta {
	OROS("oros"), COPAS("copas"), ESPADAS("espadas"), BASTOS("bastos");
	
	private String paloCarta;
	
	private PaloCarta(String paloCarta) {
		this.paloCarta = paloCarta;
	}

	@Override
	public String toString() {
		return " enum ["+paloCarta+"]";
	}
}
