package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxDefence extends Items implements Potenciar {
	
	public MaxDefence() {
		super(EnumItem.MAXDEF.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void potenciar(GestionaPokemon Pokemon) {
		Pokemon.setDefencePotenciado(20);
		
	}


}
