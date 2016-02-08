package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.Autor;
import com.wpsnetwork.library.dao.entidades.CategoriaLibro;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioAutoresMemoriaDao implements Dao<Autor>{
    
	public static List<Autor> autores = Arrays.asList(new Autor(1, "Antonio"), new Autor(2, "Pepe"), new Autor(3, "Anonimo"));
	
	// se pueden inicializar aqui variables estaticas
	static{
		
	}
	
	@Override
	public Autor get(int id) {
		for(Autor autor : this.autores){
			if (autor.getId() == id){
				return autor;				// No es la mejor forma de hacerlo, poniendo dos return en el mismo método, pero voy con prisa
			}
		}
		return null;
	}

	@Override
	public void insert(Autor elemento) {
		//miramos si hay un id igual, en caso contrario, insertamos
		boolean hayIguales = false;
		for(Autor autor: autores){
			if (autor.equals(elemento)){
				hayIguales = true;
			}
		}
		if(!hayIguales){
			autores.add(elemento);
		}
	}

	@Override
	public void update(Autor elemento) {
		// recorremos la lista y cuando encontramos el mismo id le cambiamos el nombre
		// tambien podriamos borrar y luego insertar pero lo veo mas correcto asi
		for(Autor autor : this.autores){
			if (autor.equals(elemento)){
				autor.setNombre(elemento.getNombre());
			}
		}
	}

	@Override
	public void delete(Autor elemento) {
		// recorre lista y cuando lo encuentre, lo borra
		autores.remove( elemento );
	}

	@Override
	public List<Autor> getAll() {
		return this.autores;
	}

	@Override
	public String toString() {
		return "RepositorioAutoresMemoriaDao [getAll()=" + getAll() + "]";
	}

}
