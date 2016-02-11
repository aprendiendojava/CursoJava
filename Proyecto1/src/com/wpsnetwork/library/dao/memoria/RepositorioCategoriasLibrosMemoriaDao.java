package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.CategoriaLibro;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioCategoriasLibrosMemoriaDao implements Dao<CategoriaLibro> {

	public static List<CategoriaLibro> categoriasLibros = Arrays.asList(new CategoriaLibro(1, 1, 1), new CategoriaLibro(2, 2, 2), new CategoriaLibro(2, 2, 3));
	
	@Override
	public CategoriaLibro get(int id) {
		return null;
	}

	@Override
	public void insert(CategoriaLibro elemento) {
		
	}

	@Override
	public void update(CategoriaLibro elemento) {
		
	}

	@Override
	public void delete(CategoriaLibro elemento) {
		
	}

	@Override
	public List<CategoriaLibro> getAll() {
		return null;
	}

}
