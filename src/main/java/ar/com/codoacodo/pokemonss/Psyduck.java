package ar.com.codoacodo.pokemonss;



import java.util.List;

import ar.com.codoacodo.pokemons.Ataque;

public class Psyduck extends Pokemon{

	public Psyduck() {
		super("agua", "psyduck", 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprenderAtaque(Ataque ataque) {
		
	}
	

	@Override
	public int atacar() {
		
		return 0;
	}

	@Override
	public void aprenderAtaque(List ataque) {
		ataques.add((Ataque) ataque);
		
	}
   
	
}
