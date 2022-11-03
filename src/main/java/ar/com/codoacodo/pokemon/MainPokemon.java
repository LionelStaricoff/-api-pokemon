package ar.com.codoacodo.pokemon;

import java.io.IOException;

import ar.com.codoacodo.conection.Conection;
import ar.com.codoacodo.pokemons.Ataque;
import ar.com.codoacodo.pokemonss.Pikachu;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainPokemon {
    

	
	public static void main (String [] arg ) throws IOException {
		
		Pikachu pikachu = new Pikachu();
		pikachu.aprenderAtaque(new Ataque("cabesazo",8));
		System.out.println(pikachu.atacar());
		//https://pokeapi.co/api/v2/pokemon/
		// pat: 
	
		
		//codigo trabajado en equipo segun profe
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target("https://pokeapi.co/api/v2/pokemon/");
		
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
		buscarpokemon bp = new buscarpokemon("https://pokeapi.co/api/v2/pokemon/");
		//Conection users =bp.findUsers();
		Conection b = bp.findUsers();
		System.out.println(b);
	}
	
	
}
