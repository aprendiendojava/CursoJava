package com.wpsnetwork.entidades;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private int puertas;
	private final double PI = 3.14;	// Constante
									// Hay que asignarle un valor al declararla o en el constructor.
	
	private static int numCoches = 0;
	
	// Constructores
	public Coche() {
		this("0000AAA", "", "", 0);
	}
	public Coche(String matricula, String marca, String modelo, int puertas) {
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
		setPuertas(puertas);
		numCoches++;
	}
	
	public static int getNumCoches() {
		return numCoches;
	}
	public double getPI() {
		return PI;
	}
	public String getMatricula() {
		return matricula;
	}
	//	Cuando se pasa un parámetro, se pasa siempre por valor, es decir,
//	que siempre se crea un espacio en memoria para guardar el valor del parámetro pasado,
//	aunque ya exista una igual en la clase, de manera que si lo cambiamos dentro del método
//	sólo lo cambiamos ahí y no en la instancia de la clase. Por eso se pone el this.
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	@Override
	public String toString() {
		return "Coche [matricula="+matricula+", marca="+marca+", modelo="+modelo+", puertas="+puertas+"]";
	}

}
