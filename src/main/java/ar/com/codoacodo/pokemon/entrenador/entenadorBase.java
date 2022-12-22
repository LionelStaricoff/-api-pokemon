package ar.com.codoacodo.pokemon.entrenador;

import java.util.Collection;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.Items;

public class entenadorBase {
	
	private Collection <GestionaPokemon> pokeball;
	private Collection <Items> item;
	private String name;
	
	public entenadorBase(String name) {
	
		this.name = name;
	}

	public Collection<GestionaPokemon> getPokeball() {
		return pokeball;
	}

	public void setPokeball(GestionaPokemon poke) {
		this.pokeball.add(poke);
	}

	public Collection<Items> getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item.add(item);
	}

	
}
