package ar.com.codoacodo.pokemon.main;

import java.io.IOException;

import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.buscarpokemonapi;


public class MainBatallaPokemon {


	public static void main(String[] args) throws IOException {

		buscarpokemonapi bp = new buscarpokemonapi("https://pokeapi.co/");

		PokeApi b = bp.findUsers(25);

		GestionaPokemon pikachu = new GestionaPokemon(b);
			

		 b = bp.findUsers();

		GestionaPokemon pokeMisterioso = new GestionaPokemon(b);
	

	}

}
