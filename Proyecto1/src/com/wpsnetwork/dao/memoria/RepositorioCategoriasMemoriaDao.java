package com.wpsnetwork.dao.memoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.dao.entidades.Categoria;
import com.wpsnetwork.dao.interfaces.Dao;

public class RepositorioCategoriasMemoriaDao implements Dao<Categoria> {

	private static List<Categoria> categorias = Arrays.asList(new Categoria(1, "Categoria1")
															 , new Categoria(2, "Categoria2")
															 , new Categoria(3, "Categoria3"));

	@Override
	public Categoria get(int id) {
		return null;
	}

	@Override
	public void insert(Categoria elemento) {
		
	}

	@Override
	public void update(Categoria elemento) {
		
	}

	@Override
	public void delete(Categoria elemento) {
		
	}

	@Override
	public List<Categoria> getAll() {
		return null;
	}

}
