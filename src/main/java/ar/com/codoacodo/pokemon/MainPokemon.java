package ar.com.codoacodo.pokemon;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.LoggerFinder;
import java.time.chrono.JapaneseDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codoacodo.pokeapi.Form;
import ar.com.codoacodo.pokeapi.HeldItem;
import ar.com.codoacodo.pokeapi.Move;

import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokeapi.Stat;
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
		
		//ataques
		List<Move> pokes = (List<Move>) b.moves;
		List<String> att = new ArrayList<>();
		
		//chanchadas
		for (int i =0; i< b.moves.size(); i++) {
		
		
			att.add(   b.moves.get(i).move.name);
			//System.out.println("iterando ataques: "+p);
			 }
		
		
	//	pikachu.aprenderAtaque(att); //error de casteo
		//pikachu.recorrerAtaques();
		
		/*
		System.out.println("ataques: "+pokes.size());
		List<Move> atack = new ArrayList() ;
		atack.addAll(pokes);
		
		//System.out.println("ataques: "+atack);
		//System.out.println(b.moves);
		
		
		String atk = b.moves.get(1).move.name;
		System.out.println("atk: "+atk);
		
		
		for (int i =0; i< b.moves.size(); i++) {
		String p =    b.moves.get(i).move.name; 
	
		//System.out.println("iterando ataques: "+p);
		 }
		 
		System.out.println( b.moves.get(1).move.name );
	
		
		List<Stat> hp = b.stats;
		
		for (int i =0; i< hp.size(); i++) {
			String p =  ""+  hp.get(i).baseStat; 
		
			//System.out.println("iterando hp: "+p);
			 }

		//experiencia
		System.out.println(b.baseExperience);
		
		
		//defensa
		System.out.println("defensa: "+b.stats.get(2).stat.name);
		System.out.println("defensa: "+b.stats.get(2).baseStat);
		*/
		
	
		// convierte el array b que trae los datos de la api pokemon el json
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(b));
	
	}
}
	
	
//}

