package com.wpsnetwork.library.enumerados;

public enum TipoObjeto {
	AUTOR("autor"), LIBRO("libro"), LIBROSAUTORES("librosAutores"), CATEGORIA("categoria")
	, CATEGORIALIBRO("categoriaLibro"), PRESTAMO("prestamo"), PERSONA("persona");
	
	private String tipoObjeto;
	
	private TipoObjeto (String tipoObjeto){
		this.tipoObjeto = tipoObjeto;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
