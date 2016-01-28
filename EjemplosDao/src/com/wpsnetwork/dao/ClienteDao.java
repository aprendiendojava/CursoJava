package com.wpsnetwork.dao;

import java.util.ArrayList;

import com.wpsnetwork.entidades.Cliente;

public interface ClienteDao {
	ArrayList<Cliente> getAll();
	boolean update (Cliente cliente);
	boolean insert (Cliente cliente);
	boolean delete (Cliente cliente);
	boolean add (Cliente cliente);
	Cliente getI(int i);
}
