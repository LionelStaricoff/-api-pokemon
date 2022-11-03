package ar.com.codoacodo.pokemons;

public class Ataque {

	String nombre;
	int puntoAtaque;
	public Ataque(String nombre, int puntoAtaque) {
		super();
		this.nombre = nombre;
		this.puntoAtaque = puntoAtaque;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int getPuntoAtaque() {
		return puntoAtaque;
	}

	
	
}
