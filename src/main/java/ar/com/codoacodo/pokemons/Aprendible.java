package ar.com.codoacodo.pokemons;

import java.util.Collection;
import java.util.List;

import ar.com.codoacodo.pokeapi.Move;

public interface Aprendible {

	public void aprenderUnAtaque (Ataque ataque);
	
	public void aprenderAtaque (Collection<Move> ataque);
	
	public int atacar ();

	

}
