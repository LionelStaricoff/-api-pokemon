package ar.com.codoacodo.pokemonss;

import java.util.Collection;

import java.util.HashSet;


import java.util.Set;

import ar.com.codoacodo.pokeapi.Move;
import ar.com.codoacodo.pokemons.Aprendible;
import ar.com.codoacodo.pokemons.Ataque;


public abstract class Pokemon implements Aprendible {

	protected String tipo, nombre;
	protected Set<Ataque> ataques;
	//protected Set<t> listaAtaques;
	protected Integer vida;
	
	
	
	
	public Pokemon(String tipo, String nombre, Integer vida) {
	
		this.tipo = tipo;
	
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
	
	

	public void aprenderAtaque (Collection<Move> ataque) {
		
		for (Move at : ataque) {
			int random = (int) Math.floor(Math.random() *(150) +1);
			Ataque objeto = new Ataque(at.move.name, random);
			this.ataques.add(objeto);
		}
	}
	
	}


