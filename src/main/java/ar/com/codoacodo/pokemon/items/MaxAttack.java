package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxAttack extends Items  {
	
	public MaxAttack() {
		super(EnumItem.MAXATK.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		Pokemon.setAtkPotenciado(10);
		
	}


}
