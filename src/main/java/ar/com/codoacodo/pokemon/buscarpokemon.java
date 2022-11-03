package ar.com.codoacodo.pokemon;




import ar.com.codoacodo.conection.Conection;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class buscarpokemon {
	 String url;
	
	
	public buscarpokemon(String url) {
		super();
		this.url = url;
		//findUsers();
	}
	public Conection findUsers() {
		Client client =ClientBuilder.newClient();
				
				//https://reqres.in/api/users?page=2
				WebTarget webTarget = client.target(this.url );
						//.path("api/v2/pokemon/");//parametros que van despues de/
						//.queryParam("page=2");// parametros que van despues de ? clave=valor & clave=valor
				
				//invocation
				Invocation.Builder invocation= webTarget.request(MediaType.APPLICATION_JSON);
				
				//get
				Response response = invocation.get();
				int responseCode = response.getStatus();
				System.out.println("conectando"+responseCode);
				//read
				

				 // no funciona el response
				Conection user  =(Conection)response.readEntity(Conection.class);
				//Conection user  =response.readEntity(Conection.class);
				
				return user;
			}
	

}
