package com.wpsnetwork.testeoJUnit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wpsnetwork.testeoJUnit.Cliente;

public class ClienteTest {
	private Cliente cliente;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Al iniciar el conjunto de test. Sólo se llama una vez
		// Crear objetos que son necesarios para todas las pruebas
		// Aquí se podría abrir un fichero
//		this.cliente = null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Se llama sólo una vez al final de todos los test.
		// Liberar recursos.
		// Aquí se podría cerrar un fichero
//		this.cliente = null;
	}

	@Before
	public void setUp() throws Exception {
		// Se llama antes de cada test
		cliente = new Cliente(1, "Pepito", 1);
	}

	@After
	public void tearDown() throws Exception {
		// Se llama después de cada test 
	}

	@Test
	public void testClienteIntStringInt() {
		int codigo = cliente.getId();
		String nombre = cliente.getNombre();
		int edad = cliente.getEdad();
		
		assertTrue("Fallo en el constructor: id", codigo == 1);
		assertEquals("Fallo en el constructor: Nombre", "Pepito", nombre);
		assertEquals("Fallo en el constructor: Edad", 30, edad);
	}

	@Test
	public void testGetId() {
		assertEquals("Id no coincide", 1, cliente.getId());
	}

	@Test
	public void testSetId() {
		cliente.setId(10);
		assertEquals("setter no funciona", 10, cliente.getId());
	}

	@Test
	public void testGetNombre() {
		
		
	}

	@Test
	public void testSetNombre() {
		cliente.setNombre("Juanito");
		assertEquals("setter no funciona", "Juanito", cliente.getNombre());
	}

	@Test
	public void testGetEdad() {
		assertEquals("Id no coincide", 30, cliente.getEdad());
	}

	@Test
	public void testSetEdad() {
		cliente.setEdad(10);
		assertEquals("setter no funciona", 10, cliente.getEdad());
	}

}
