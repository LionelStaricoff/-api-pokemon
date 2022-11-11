package ar.com.codoacodo.pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import ar.com.codoacodo.conection.Conection;
import ar.com.codoacodo.pokeapi.Move;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class mainDumy {
	
	public static void main (String [] arg ) throws IOException {
		
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
		List<ar.com.codoacodo.conection.Result> p   = b.results;
		System.out.println(p.get(1));
		List<ar.com.codoacodo.conection.Result> listaPokemon = new ArrayList<>();
		
		for (int i =0; i< p.size(); i++) {
			//String pi =    p.get(i).name; //nombres ok
			//String pi =    p.get(i).url; // trae json con los poke del 1 al 20
			ar.com.codoacodo.conection.Result pi =    p.get(i);
			listaPokemon.add(pi);
			//System.out.println("iterando nombres: "+pi);
			}
		System.out.println(listaPokemon.get(1).name);
		//listaPokemon.forEach(System.out:: println);
		
	}

}
