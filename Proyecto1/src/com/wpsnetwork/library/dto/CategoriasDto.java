package com.wpsnetwork.library.dto;

import com.wpsnetwork.library.dao.entidades.Categoria;
import com.wpsnetwork.library.dao.factorias.FactoriaDao;
import com.wpsnetwork.library.dao.interfaces.Dao;
import com.wpsnetwork.library.dao.memoria.RepositorioCategoriasLibrosMemoriaDao;
import com.wpsnetwork.library.enumerados.TipoObjeto;

public class CategoriasDto {
//	private CategoriaLibro categoriaLibro;
	private Dao<Categoria> repCategoria;
	
	public CategoriasDto() {
		super();
		repCategoria = (Dao<Categoria>) new FactoriaDao().getDao("MEMORIA", TipoObjeto.CATEGORIA);
	}
	
	public CategoriasDto(Dao<Categoria> repCategoria) {
		super();
		this.repCategoria = repCategoria;
	}

	@Override
	public String toString() {
		return "CategoriasDto [repCategoria=" + repCategoria.toString() + "]";
	}
	
	
}
