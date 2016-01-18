package com.wpsnetwork.entidades;

public class Figura {
	public static class Coordenada2D {
		//Clase interna estática.
		//Se comporta como una clase normal, pero puede acceder a las propiedades estáticas de la clase contenedor.
		//Puede tener los modificadores final, public, protected y private.
		
		private class Punto{
			//Clase interna miembro.
			//Tiene acceso a los miembros de la clase contenedor aunque sean privados.
			//Puede tener los modificadores public, protected o private.
			//No pueden tener propiedades estáticas.
			private int valor;
			
			public Punto() {
				this(0);
			}

			public Punto(int valor) {
				super();
				this.valor = valor;
			}

			public int getValor() {
				return valor;
			}

			public void setValor(int valor) {
				this.valor = valor;
			}
		}
		
		private Punto x;
		private Punto y;

		public Coordenada2D (int x, int y){
			super();
			this.x = new Punto(x);
			this.y = new Punto(y);
			numCoordenadas++;
		}
		
		public int getX() {
			return x.getValor();
		}

		public void setX(int x) {
			this.x = new Punto(x);
		}

		public int getY() {
			return y.getValor();
		}

		public void setY(int y) {
			this.y = new Punto(y);
		}
	}
	
	// Esto es de la clase Figura
	
	static{
		//constructor estático.
		//Sólo tenemos acceso a las propiedades y métodos estáticos.
		//Sólo se llama una vez.
		numCoordenadas = 0;
	}

	private Coordenada2D posicion;
	private static int numCoordenadas;	// cada vez que cree una coordenada, aumentaré este. Para ver cómo se puede llamar desde dentro de la clase static
	
	public Figura(Coordenada2D posicion) {
		super();
		this.posicion = posicion;
	}

	public Coordenada2D getPosicion() {
		return posicion;
	}

	public void setPosicion(Coordenada2D posicion) {
		this.posicion = posicion;
	}

	public static int getNumCoordenadas() {
		return numCoordenadas;
	}

	public static void setNumCoordenadas(int numCoordenadas) {
		Figura.numCoordenadas = numCoordenadas;
	}
	
}
