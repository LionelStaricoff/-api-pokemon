package ar.com.codoacodo.pokemon.items;



import ar.com.codoacodo.item.Item;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class BuscaItem {

	private int numero;
	
	
	public BuscaItem(int num) {
		this.numero = num;
	}


	public Item findItem() {
		//int random = (int) Math.floor(Math.random() *(905) +1);
	
		Client client =ClientBuilder.newClient();
				
				//https://reqres.in/api/users?page=2
				WebTarget webTarget = client.target("https://pokeapi.co/api/v2/" )
						.path("item/"+this.numero);//parametros que van despues de/
						//.queryParam("page=2");// parametros que van despues de ? clave=valor & clave=valor
				
				//invocation
				Invocation.Builder invocation= webTarget.request(MediaType.APPLICATION_JSON);
				
				//get
				Response response = invocation.get();
				int responseCode = response.getStatus();
				//System.out.println("conectando"+responseCode);
				//read
				
			//	String users = response.readEntity(String.class);
			//	System.out.println(users);
// problema creando el user, volver a bajara el 2pojo
				Item user = response.readEntity(Item.class);
				
				return  user;
			}
	/*
	public static void main (String args[]) {
		BuscaItem bp = new BuscaItem(58);
	Item pocion =	bp.findItem();
	System.out.println(pocion.name);
	System.out.println(pocion.cost);
	//cura Restores 20 HP.
	System.out.println(pocion.effectEntries.get(0).shortEffect);
	//img
	System.out.println(pocion.sprites._default);
	}
	*/
}
