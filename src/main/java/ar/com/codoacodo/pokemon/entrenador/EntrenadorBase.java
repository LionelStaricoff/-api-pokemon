package ar.com.codoacodo.pokemon.entrenador;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.Items;

public class EntrenadorBase {
	
	private ArrayList <GestionaPokemon> pokeball = new ArrayList<>();
	private ArrayList <Items> item = new ArrayList<>();
	private String name;
	
	public EntrenadorBase(String name) {
	
		this.name = name;
	}

	public GestionaPokemon getPokeball(int poke) {
		return this.pokeball.get(poke);
	}

	public void setPokeball(GestionaPokemon poke) {
		this.pokeball.add(poke);
	}

	public Items getItem(int it) {
		return this.item.get(it);
	}

	public void setItem(Items item) {
		this.item.add(item);
	}
	
	public int cantidadPokemon() {
		return this.pokeball.size();
	}

	
}
