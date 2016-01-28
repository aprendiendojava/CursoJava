package com.wpsnetwork.testeoJUnit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wpsnetwork.testeoJUnit.Operaciones;

public class OperacionesTest {

	@Test
	public void testSuma() {
		int res = Operaciones.suma(1, 2);
		assertEquals("Suma falla", 3, res);
	}

}
