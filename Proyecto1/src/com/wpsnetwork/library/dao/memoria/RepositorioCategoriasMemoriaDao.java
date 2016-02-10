package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.Categoria;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioCategoriasMemoriaDao implements Dao<Categoria> {

	private static List<Categoria> categorias = Arrays.asList(new Categoria(1, "Categoria1")
															 , new Categoria(2, "Categoria2")
															 , new Categoria(3, "Categoria3"));

	@Override
	public Categoria get(int id) {
		return (Categoria) categorias.stream().sorted().distinct().filter(e -> e.getId() == id);
	}

	@Override
	public void insert(Categoria elemento) {
		//miramos si hay un id igual, en caso contrario, insertamos
		boolean hayIguales = false;
		for(Categoria categoria: categorias){
			if (categoria.equals(elemento)){
				hayIguales = true;
			}
		}
		if(!hayIguales){
			categorias.add(elemento);
		}
	}

	@Override
	public void update(Categoria elemento) {
		for(Categoria a:categorias){
			if(a.equals(elemento)){
				a.setNombre(elemento.getNombre());
			}
		}
	}

	@Override
	public void delete(Categoria elemento) {
		categorias.remove(elemento);
	}

	@Override
	public List<Categoria> getAll() {
		List<com.wpsnetwork.library.dao.entidades.Categoria> categoriasDao = Arrays.asList(categorias.get(0), categorias.get(1), categorias.get(2)); 
		return categoriasDao;
	}

	@Override
	public String toString() {
		return "RepositorioCategoriasMemoriaDao [getAll()=" + getAll() + "]";
	}

}
