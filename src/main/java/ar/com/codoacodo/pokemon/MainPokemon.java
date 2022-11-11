package ar.com.codoacodo.pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ar.com.codoacodo.pokeapi.Ability;
import ar.com.codoacodo.pokeapi.Move;
import ar.com.codoacodo.pokeapi.Move__1;
import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokemons.Ataque;
import ar.com.codoacodo.pokemonss.Charizard;
import ar.com.codoacodo.pokemonss.Pikachu;
import ar.com.codoacodo.pokemonss.Psyduck;

public class MainPokemon {
    

	
	public static void main (String [] arg ) throws IOException {
		
		
		//testeando pokemon
		
		Pikachu pikachu = new Pikachu();
		pikachu.aprenderAtaque(new Ataque("cabesazo",8));
		System.out.println("atacando"+pikachu.getNombre()+" "+pikachu.atacar());
		//https://pokeapi.co/api/v2/pokemon/
		// pat: 
		
		
		Psyduck psyduck = new Psyduck();
		psyduck.aprenderAtaque(new Ataque("cabesazo",8));
		System.out.println("atacando"+psyduck.getNombre()+" "+psyduck.atacar());
		
		Charizard charizard = new Charizard();
		System.out.println("atacando primero "+charizard.getNombre()+" "+charizard.atacar());
		
		charizard.aprenderAtaque(new Ataque("cabesazo",8));
		System.out.println("atacando despues "+charizard.getNombre()+" "+charizard.atacar());
		
		
		
		
		
		
		
		
		
		
		//codigo trabajado en equipo segun profe
		/*
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target("https://pokeapi.co");
		
		Invocation.Builder invocation= webTarget.request(MediaType.APPLICATION_JSON);
		
		Response response = invocation.get();
		
		int responseCode = response.getStatus();
		if (responseCode !=200) {
			throw new RuntimeException("Ocurrio un error" + responseCode);
			//nueva coneccion
		}
		
		System.out.println(response);
		
		
		System.out.println(responseCode);
	
		
		//nueva clase buscarpokemon
		
		buscarpokemon bp = new buscarpokemon("https://pokeapi.co/");
		
		Conection b = bp.findUsers();
		System.out.println(b);

	*/

		//buscapokemonapi
	buscarpokemonapi bp = new buscarpokemonapi("https://pokeapi.co/");
		
	PokeApi b = bp.findUsers(3);
		System.out.println(b.sprites.other.dreamWorld.frontDefault);
		System.out.println(b.name);
		
		List<Move> pokes = (List<Move>) b.moves; //.forEach(System.out::println);
		//pokes.forEach(System.out::println);
		System.out.println("ataques: "+pokes.size());
		List<Move> atack = new ArrayList() ;
		atack.addAll(pokes);
		
		System.out.println("ataques: "+atack);
		//System.out.println(b.moves);
		String atk = b.moves.get(1).move.name;
		System.out.println("atk: "+atk);
		
		
		for (int i =0; i< b.moves.size(); i++) {
		String p =    b.moves.get(i).move.name; //.forEach(System.out::println);
		//p.forEach(System.out::println);
		System.out.println("iterando ataques: "+p);
		}

	}
	
	
}
