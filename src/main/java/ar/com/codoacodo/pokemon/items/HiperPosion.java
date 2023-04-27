package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class HiperPosion extends Items  {
	
	public HiperPosion() {
		super(EnumItem.HIPERPOCION.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		Pokemon.setHp(200);
		if(Pokemon.getHp() > Pokemon.getVidaTotal()) {
			Pokemon.setHp(Pokemon.getVidaTotal());
	}
	}

}
