package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class Revive extends Items  {
	
	public Revive() {
		super(EnumItem.REVIVE.getKey());
	
	}

	//comprar varios items
	public Revive(int cantidad) {
		super(EnumItem.REVIVE.getKey(), cantidad);
	}
	@Override
	public void utilizar(GestionaPokemon Pokemon) {
		if(Pokemon.getHp()<1) {
		GestionaPokemon poke = Pokemon.setHp(Pokemon.getVidaTotal()/2);
		System.out.println("pokemon curado");
	    System.out.println(poke.getNombre()+" hp: "+ poke.getHp());
		this.cantidad--;
		}else {
			this.cantidad++;
		}
	}

}
