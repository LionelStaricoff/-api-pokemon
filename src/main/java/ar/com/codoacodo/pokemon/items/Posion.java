package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class Posion extends Items implements Curable {
	
	public Posion() {
		super(EnumItem.POCION.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curar(GestionaPokemon Pokemon) {
		Pokemon.setHp(20);
		
	}

}
