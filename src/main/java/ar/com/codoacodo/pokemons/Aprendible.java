package ar.com.codoacodo.pokemons;

import java.util.List;

public interface Aprendible<t> {

	public void aprenderAtaque (Ataque ataque);
	
	public void aprenderAtaque (List<t> ataque);
	
	public int atacar ();

	

}
