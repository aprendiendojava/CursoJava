package com.wpsnetwork.library.dao.interfaces;

import java.util.List;

public interface Dao<T> {
	public T get(int id);
	public void insert (T elemento);
	public void update (T elemento);
	public void delete (T elemento);
	public List<T> getAll ();
}
