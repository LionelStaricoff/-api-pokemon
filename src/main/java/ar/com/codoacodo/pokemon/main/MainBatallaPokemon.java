package ar.com.codoacodo.pokemon.main;

import java.io.IOException;

import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.base.buscarpokemonapi;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;


public class MainBatallaPokemon {


	public static void main(String[] args) throws IOException {


		
		GestionaPokemon pikachu = new GestionaPokemon(25);
		
			
		


		GestionaPokemon pokeMisterioso = new GestionaPokemon(382);
	
		
		
	
		
		EntrenadorBase entrenador = new EntrenadorBase("lio");
		entrenador.setPokeball(pokeMisterioso);
		entrenador.setPokeball(pikachu);
		System.out.println("tengo "+entrenador.cantidadPokemon()+" pokemon");
		System.out.println(entrenador.getPokeball(0).getNombre());
		System.out.println(entrenador.getPokeball(1).getNombre());
		
		EntrenadorBase entrenador2 = new EntrenadorBase("agus");
		entrenador.setPokeball(pokeMisterioso);
		entrenador.setPokeball(pokeMisterioso);

		batallaPokemon bp = new batallaPokemon(entrenador, entrenador2);
		
		GestionaPokemon poke1 =bp.elegirPokemon(entrenador, 0);
		GestionaPokemon poke2 =bp.elegirPokemon(entrenador2, 0);
		bp.atacar(poke2, 30, poke1);
		System.out.println(bp.verificarVida(poke1) );
	}

}
