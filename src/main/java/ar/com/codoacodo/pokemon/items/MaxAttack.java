package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxAttack extends Items implements Potenciar {
	
	public MaxAttack() {
		super(EnumItem.MAXATK.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void potenciar(GestionaPokemon Pokemon) {
		Pokemon.setAtkPotenciado(10);
		
	}


}
