package ar.com.codoacodo.pokemon.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokemon.buscarpokemonapi;

public class MainBatallaPokemon {


	public static void main(String[] args) throws IOException {

		buscarpokemonapi bp = new buscarpokemonapi("https://pokeapi.co/");

		PokeApi b = bp.findUsers(25);

		GestionaPokemon pikachu = new GestionaPokemon(b);
			

		//ObjectMapper mapper = new ObjectMapper();
		//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pikachu));

		//pikachu.getImagenesFront().forEach(System.out::println);
		//img.add(p.sprites.other.home.frontShiny);
	//	img.add(p.sprites.other.home.frontDefault);
	//	img.add((String) p.sprites.other.home.frontFemale);
		//img.add((String) p.sprites.other.home.frontShinyFemale
		System.out.println(pikachu.getMoves(1));
		System.out.println(pikachu.getMoves(2));
		System.out.println(pikachu.getMoves(3));
		System.out.println(pikachu.getMoves(4));
		System.out.println(pikachu.attack(4));
		System.out.println(pikachu.specialAttack(4));
		System.out.println(pikachu.getImagenesFront(0));
		System.out.println(pikachu.getImagenesBack(0));

	}

}
