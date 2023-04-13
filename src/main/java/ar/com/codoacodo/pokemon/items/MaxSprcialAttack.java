package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxSprcialAttack extends Items implements Potenciar {
	
	public MaxSprcialAttack() {
		super(EnumItem.MAXSPECIALATTAK.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void potenciar(GestionaPokemon Pokemon) {
		Pokemon.setAtkPotenciado(30);
		
	}


}
