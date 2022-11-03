package ar.com.codoacodo.pokemon;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainPokemon {

	
	public static void main (String [] arg ) {
		
		
		//https://pokeapi.co/api/v2/pokemon/
		// pat: 
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target("https://pokeapi.co/api/v2/pokemon/");
		
		Invocation.Builder invocation= webTarget.request(MediaType.APPLICATION_JSON);
		
		Response response = invocation.get();
		
		
		System.out.println(response);
	}
	
	
}
