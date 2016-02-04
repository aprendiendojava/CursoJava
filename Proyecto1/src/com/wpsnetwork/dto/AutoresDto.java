package com.wpsnetwork.dto;

import java.util.List;

import com.wpsnetwork.dao.factorias.FactoriaDao;
import com.wpsnetwork.dao.interfaces.Dao;
import com.wpsnetwork.dao.interfaces.DaoAutores;
import com.wpsnetwork.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.dto.entidades.Autor;
import com.wpsnetwork.dto.entidades.Libro;
import com.wpsnetwork.enumerados.TipoObjeto;

public class AutoresDto implements Dao{
	private Autor autorDto = new Autor();
	private List<Libro> libros;
	private String tipoAcceso;
	private DaoAutores autoresDao = (DaoAutores) FactoriaDao.getDao(tipoAcceso, TipoObjeto.AUTOR);

	public AutoresDto(String tipoAcceso2) {
		super();
		this.tipoAcceso = tipoAcceso;
	}

	@Override
	public Object get(int id) {
		com.wpsnetwork.dao.entidades.Autor autorDao = autoresDao.get(id);
//		return new Autor(autorDao, null)
		return null;
	}
	
	@Override
	public void insert(Object elemento) {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public void insert(Autor elemento) {
//		if(autoresDao.get(elemento.getId()) == null){
////			com.wpsnetwork.dao.entidades.Autor autorDao = new com.wpsnetwork.dao.entidades.Autor(elemento.getId()), elemento.getNombre());
//		}
//		
//	}

	@Override
	public void update(Object elemento) {
		
	}

	@Override
	public void delete(Object elemento) {
		
	}

	@Override
	public List getAll() {
		return null;
	}
}
