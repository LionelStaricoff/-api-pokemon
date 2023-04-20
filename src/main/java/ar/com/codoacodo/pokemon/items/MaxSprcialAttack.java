package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class MaxSprcialAttack extends Items  {
	
	public MaxSprcialAttack() {
		super(EnumItem.MAXSPECIALATTAK.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		Pokemon.setAtkPotenciado(30);
		
	}


}
