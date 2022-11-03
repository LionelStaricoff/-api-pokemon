package ar.com.codoacodo.pokemonss;

import java.util.HashSet;
import java.util.Set;

import ar.com.codoacodo.pokemons.Aprendible;
import ar.com.codoacodo.pokemons.Ataque;

public abstract class Pokemon implements Aprendible {

	protected String tipo, nombre;
	protected Set<Ataque> ataques;
	protected Integer vida;
	
	
	
	
	public Pokemon(String tipo, String nombre, Integer vida) {
		super();
		this.tipo = tipo;
		this.ataques = ataques;
		this.vida = vida;
		this.nombre = nombre;
		iniciarAtaques();
	}



	private void iniciarAtaques() {
		ataques = new HashSet<>();
	}

	public String getTipo() {
		return tipo;
	}

	public Set<Ataque> getAtaques() {
		return ataques;
	}

	public Integer getVida() {
		return vida;
	}



	public String getNombre() {
		return nombre;
	}
	
}
