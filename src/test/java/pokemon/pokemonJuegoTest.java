package pokemon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.items.Items;
import ar.com.codoacodo.pokemon.items.Posion;
import ar.com.codoacodo.pokemon.items.Revive;

public class pokemonJuegoTest {
	private Items rv;
	private GestionaPokemon pokemon;
	
	

	@Test
	public void reviveTest() {
	
		rv.consumirItem();
		assertEquals(0, rv.getCantidad());
		
	}
	
	@Before
	public void crearItems() throws IOException {
		 this.rv = new Revive();
		this.pokemon = new GestionaPokemon();
	}
	
	@Ignore
	@Test
	public void comprarMuchosRevive() {
		 rv = new Posion(4);
		 assertEquals(4,rv.getCantidad());
		 assertNotNull(rv);
	}

	// clase para probar el test de null
	public <T> Object probandoNull(String num) {
	if(num.isEmpty()) {
		 throw new  NullPointerException();
	}
	return  null;
	// return Integer.parseInt(num);
	}
	
	@Ignore
	@Test
	public void probarNull() {
		assertNull(probandoNull("1"));
	}
	
	@Test
	public void utilizarRevive() {
		assertEquals(0, 0);
	}
}
