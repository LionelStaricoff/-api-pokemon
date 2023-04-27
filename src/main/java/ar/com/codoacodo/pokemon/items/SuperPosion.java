package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class SuperPosion extends Items  {
	
	public SuperPosion() {
		super(EnumItem.SUPERPOCION.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		Pokemon.setHp(50);
		if(Pokemon.getHp() > Pokemon.getVidaTotal()) {
			Pokemon.setHp(Pokemon.getVidaTotal());
	}
	}

}
