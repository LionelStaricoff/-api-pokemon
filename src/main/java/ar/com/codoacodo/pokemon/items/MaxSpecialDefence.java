package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxSpecialDefence extends Items implements Potenciar {
	
	public MaxSpecialDefence() {
		super(EnumItem.MAXSPECIALDEFFENCE.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void potenciar(GestionaPokemon Pokemon) {
		Pokemon.setDefencePotenciado(40);
		
	}


}
