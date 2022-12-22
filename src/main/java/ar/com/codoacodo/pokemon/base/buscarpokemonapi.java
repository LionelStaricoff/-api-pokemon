package ar.com.codoacodo.pokemon.base;




import java.io.IOException;

import ar.com.codoacodo.pokeapi.PokeApi;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class buscarpokemonapi {
	 String url;
	
	
	public buscarpokemonapi(String url) {
		super();
		this.url = url;
		//findUsers();
	}
	public PokeApi findUsers() {
		int random = (int) Math.floor(Math.random() *(905) +1);
	
		Client client =ClientBuilder.newClient();
				
				//https://reqres.in/api/users?page=2
				WebTarget webTarget = client.target(getUrl() )
						.path("/api/v2/pokemon/"+random);//parametros que van despues de/
						//.queryParam("page=2");// parametros que van despues de ? clave=valor & clave=valor
				
				//invocation
				Invocation.Builder invocation= webTarget.request(MediaType.APPLICATION_JSON);
				
				//get
				Response response = invocation.get();
				int responseCode = response.getStatus();
				//System.out.println("conectando"+responseCode);
				//read
				

				PokeApi user = response.readEntity(PokeApi.class);
				
				return  user;
			}
	
	public PokeApi findUsers(int numero) throws IOException {
		int random =  numero;
		
		if(random >905) {
			throw new IOException("El pokemon no existe");
			
		}
		String r = ""+ random;
		

		
		Client client = ClientBuilder.newClient();
		
		WebTarget webTarget = client.target(getUrl())
				.path("api/v2/pokemon/"+r);
		
		Invocation.Builder invocation= webTarget.request(MediaType.APPLICATION_JSON);
	
		
		Response response = invocation.get();
		
		int responsecode = response.getStatus();
		
		PokeApi user = response.readEntity(PokeApi.class);
		
		return user;
			}
	public String getUrl() {
		return url;
	}
	

}
