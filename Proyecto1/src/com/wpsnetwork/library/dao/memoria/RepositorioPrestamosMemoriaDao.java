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
		return null;
	}

	@Override
	public void insert(Prestamo elemento) {
		
	}

	@Override
	public void update(Prestamo elemento) {
		
	}

	@Override
	public void delete(Prestamo elemento) {
		
	}

	@Override
	public List<Prestamo> getAll() {
		return null;
	}

}
