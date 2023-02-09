package ar.com.codoacodo.pokemon.entrenador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.Items;

public class EntrenadorBase {
	
	private ArrayList <GestionaPokemon> pokeball = new ArrayList<>();
	private ArrayList <Items> item = new ArrayList<>();
	private String name;
	
	public boolean meQuedanPokemon() {
		Iterator<GestionaPokemon> lista = this.pokeball.iterator();
			while(lista.hasNext()) {
				
				if(!verificarVida(lista.next())) {
					return true;
			}
			}
					
				return false;
			
			
	}
	
	public boolean verificarVida(GestionaPokemon p) {
		return (p.getHp()<1)?true :false;
	}
	
	public EntrenadorBase(String name) {
	
		this.name = name;
	}

	public GestionaPokemon getPokeball(int poke) {
		// colocar null exception
		return this.pokeball.get(poke);
	}

	public void setPokeball(GestionaPokemon poke) {
		this.pokeball.add(poke);
	}

	public Items getItem(int it) {
		// colocar null exception
		return this.item.get(it);
	}

	public void setItem(Items item) {
		this.item.add(item);
	}
	
	public int cantidadPokemon() {
		return this.pokeball.size();
	}

	public String getName() {
		return name;
	}

	
}
