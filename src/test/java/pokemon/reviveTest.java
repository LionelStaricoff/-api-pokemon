package pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.com.codoacodo.pokemon.items.Posion;
import ar.com.codoacodo.pokemon.items.Revive;

public class reviveTest {

	//consumir el item quede en cero
	@Test
	public void reviveTest() {
		Revive rv = new Revive();
		rv.consumirItem();
		assertEquals(0, rv.getCantidad());
		
	}
	
	
	@Test
	public void comprarMuchosRevive() {
		assertEquals(4, new Revive(4).getCantidad());
	}
	
	@Test
	public void posionTest() {
		Posion rv = new Posion();
		rv.consumirItem();
		assertEquals(0, rv.getCantidad());
		
	}
	
}
