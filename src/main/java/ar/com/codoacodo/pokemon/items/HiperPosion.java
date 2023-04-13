package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class HiperPosion extends Items implements Curable {
	
	public HiperPosion() {
		super(EnumItem.HIPERPOCION.getKey());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curar(GestionaPokemon Pokemon) {
		Pokemon.setHp(200);
		
	}

}
