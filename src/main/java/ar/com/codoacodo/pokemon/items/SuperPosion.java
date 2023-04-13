package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class SuperPosion extends Items implements Curable {
	
	public SuperPosion() {
		super(EnumItem.SUPERPOCION.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curar(GestionaPokemon Pokemon) {
		Pokemon.setHp(50);
		
	}

}
