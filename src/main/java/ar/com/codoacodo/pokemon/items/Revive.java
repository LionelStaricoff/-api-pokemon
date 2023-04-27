package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class Revive extends Items  {
	
	public Revive() {
		super(EnumItem.REVIVE.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		if(Pokemon.getHp()<1) {
		Pokemon.setHp(Pokemon.getVidaTotal()/2);
		}else {
			this.cantidad++;
		}
	}

}
