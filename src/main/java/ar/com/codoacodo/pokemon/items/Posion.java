package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class Posion extends Items  {
	
	public Posion() {
		super(EnumItem.POCION.getKey());
		// TODO Auto-generated constructor stub
	}

	public Posion(int num) {
		super(EnumItem.POCION.getKey(), num);
	}
	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		Pokemon.setHp(20);
		if(Pokemon.getHp() > Pokemon.getVidaTotal()) {
			Pokemon.setHp(Pokemon.getVidaTotal());
	}
	}

}
