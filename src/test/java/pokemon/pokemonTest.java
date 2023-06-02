package pokemon;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ar.com.codoacodo.pokemon.items.HiperPosion;
import ar.com.codoacodo.pokemon.items.Items;
import ar.com.codoacodo.pokemon.items.Posion;
import ar.com.codoacodo.pokemon.items.Revive;

public class pokemonTest {
	private Items rv;
	
	// esta anotacion significa que ejecuta este codigo
	// siempre antes de cada test para no repetir la
	// crreacion del item rv
	@Before
	public void ejecutaAntes() {
		 rv = new Revive(4);
	}

	//consumir el item quede en cero
	@Test
	public void reviveTest() {
		
		rv.consumirItem();
		assertEquals(3, rv.getCantidad());
		
	}
	
	
	@Test
	public void comprarMuchosRevive() {
		assertEquals(4, rv.getCantidad());
	}
	
	@Test
	public void posionTest() {
		 rv = new Posion();
		rv.consumirItem();
		assertEquals(0, rv.getCantidad());
		
	}
	
	@Test
	public void hiperTest() {
	    rv = new HiperPosion();
		rv.consumirItem();
		assertEquals(0, rv.getCantidad());
		
	}
	
	// clase para probar el test de null
	public int probandoNull(String num) {
	if(num.isEmpty()) {
		 throw new  NullPointerException();
	}
	 return Integer.parseInt(num);
	}
	
	//para que la respuesta sea la excepcion indicada
	@Test(expected = NullPointerException.class)
	public void notNullhiperTest() {
	 probandoNull(null);
	}
}
