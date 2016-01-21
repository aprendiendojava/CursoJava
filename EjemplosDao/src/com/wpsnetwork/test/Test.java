package com.wpsnetwork.test;

import com.wpsnetwork.dao.ClienteDao;
import com.wpsnetwork.dao.ClienteHibernateDao;
import com.wpsnetwork.dao.ClienteOracleDao;

public class Test {

	public static void main(String[] args) {
		ClienteDao dao1 = new ClienteHibernateDao ();
		ClienteDao dao2 = new ClienteOracleDao ();
		int i = 0;
		dao1.getI(i);
	}

}
