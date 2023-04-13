package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class Revive extends Items implements Curable {
	
	public Revive() {
		super(EnumItem.REVIVE.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curar(GestionaPokemon Pokemon) {
		
		Pokemon.setHp(Pokemon.getVidaTotal()/2);
		
	}

}
