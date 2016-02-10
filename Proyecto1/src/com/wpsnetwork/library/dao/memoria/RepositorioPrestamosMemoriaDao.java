package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.Prestamo;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioPrestamosMemoriaDao implements Dao<Prestamo> {

	public static List<Prestamo> prestamos = Arrays.asList(
			new Prestamo(1, new Date(2016, 02, 01), new Date(2016, 02, 30), 'N', 1, 2)
			, new Prestamo(2, new Date(2015, 10, 01), new Date(2015, 11, 30), 'N', 2, 3)
			, new Prestamo(3, new Date(2015, 12, 01), new Date(2016, 01, 30), 'N', 3, 2)); 
			
	@Override
	public Prestamo get(int id) {
		return (Prestamo) prestamos.stream().filter(e -> e.getId() == id);
	}

	@Override
	public void insert(Prestamo elemento) {
		//miramos si hay un id igual, en caso contrario, insertamos
		boolean hayIguales = false;
		for(Prestamo prestamo:prestamos){
			if(prestamo.equals(elemento)){
				hayIguales = true;
			}
		}
		if(!hayIguales){
			prestamos.add(elemento);
		}
	}

	@Override
	public void update(Prestamo elemento) {
		boolean borrado = prestamos.remove(elemento);
		if(borrado){
			prestamos.add(elemento);
		}
	}

	@Override
	public void delete(Prestamo elemento) {
		prestamos.remove(elemento);
	}

	@Override
	public List<Prestamo> getAll() {
		List<Prestamo> prestamosDao = Arrays.asList(this.prestamos.get(0), this.prestamos.get(1), this.prestamos.get(2));
		return prestamosDao;
	}

	@Override
	public String toString() {
		return "RepositorioPrestamosMemoriaDao [getAll()=" + getAll().toString() + "]";
	}
}
