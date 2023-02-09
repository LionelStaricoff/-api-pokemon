package ar.com.codoacodo.pokemon.main;

import java.io.IOException;

import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokemon.base.BuildGestionaPokemonImpl;
import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.PokemonBuilder;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.base.buscarpokemonapi;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;
import ar.com.codoacodo.user.Usuario;


public class MainBatallaPokemon {


	public static void main(String[] args) throws IOException {


		
		
		// 
		
		
		
		
		GestionaPokemon pikachu = new GestionaPokemon(25);
		GestionaPokemon pokeMisterioso = new GestionaPokemon(382);
		
		
		
		
		
	
		System.out.println("pikachu: "+ pikachu.getNombre());
		System.out.println("pokeMisterioso: "+pokeMisterioso.getNombre()
		+", atack: "+pokeMisterioso.getAtack() 
		+", baseExperiencia: "+pokeMisterioso.getBaseExperiencia());
		
		
		//provando el BuildGestionaPokemonImpl para construir pokemon
		BuildGestionaPokemonImpl po = new BuildGestionaPokemonImpl();
		po.buildInicial();
		po.nombre("pepe");;
		po.atack(200);
		po.baseExperiencia(100);
		
		pokeMisterioso =  po.build();
		System.out.println("pokeMisterioso: "+pokeMisterioso.getNombre()
		+", atack: "+pokeMisterioso.getAtack() 
		+", baseExperiencia: "+pokeMisterioso.getBaseExperiencia());	
		
		System.out.println(pokeMisterioso);
		
		// finaliza la prueba con exito
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
				
		GestionaPokemon pokeMisterioso1 = new GestionaPokemon();
		GestionaPokemon pokeMisterioso2 = new GestionaPokemon();
		System.out.println(pokeMisterioso1.getNombre() +" "+pokeMisterioso2.getNombre());
		
		
		
		EntrenadorBase entrenador = new EntrenadorBase("lio");
		entrenador.setPokeball(pokeMisterioso);
		entrenador.setPokeball(pikachu);
		System.out.println("tengo "+entrenador.cantidadPokemon()+" pokemon");
		System.out.println(entrenador.getPokeball(0).getNombre());
		System.out.println(entrenador.getPokeball(1).getNombre());
		
		EntrenadorBase entrenador2 = new EntrenadorBase("agus");
		entrenador2.setPokeball(pokeMisterioso1);
		entrenador2.setPokeball(pokeMisterioso2);
		System.out.println("tengo "+entrenador2.cantidadPokemon()+" pokemon");
		System.out.println(entrenador2.getPokeball(0).getNombre());
		System.out.println(entrenador2.getPokeball(1).getNombre());

		
		
		batallaPokemon bp = new batallaPokemon(entrenador, entrenador2);
		
		GestionaPokemon poke1 =bp.elegirPokemon(entrenador, 0);
		GestionaPokemon poke2 =bp.elegirPokemon(entrenador2, 0);
		bp.atacar(poke2, 30, poke1);
		System.out.println(bp.verificarVida(poke1) );
	}

}
