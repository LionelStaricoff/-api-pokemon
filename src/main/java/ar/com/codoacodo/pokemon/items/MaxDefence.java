package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxDefence extends Items  {
	
	public MaxDefence() {
		super(EnumItem.MAXDEF.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		Pokemon.setDefencePotenciado(20);
		
	}


}
