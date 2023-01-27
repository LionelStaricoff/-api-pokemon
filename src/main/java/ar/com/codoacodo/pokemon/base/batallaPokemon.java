package ar.com.codoacodo.pokemon.base;

import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;

public class batallaPokemon {
private EntrenadorBase entrenador1,entrenador2,entrenador3,entrenador4;
	
	public void comenzarBatalla(Integer numero) {
		
	}

	public batallaPokemon(EntrenadorBase entrenador1, EntrenadorBase entrenador2) {
	
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
	}

	public batallaPokemon(EntrenadorBase entrenador1, EntrenadorBase entrenador2, EntrenadorBase entrenador3) {
	
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
		this.entrenador3 = entrenador3;
	}

	public batallaPokemon(EntrenadorBase entrenador1, EntrenadorBase entrenador2, EntrenadorBase entrenador3,
			EntrenadorBase entrenador4) {
		
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
		this.entrenador3 = entrenador3;
		this.entrenador4 = entrenador4;
	}
	
	
	public GestionaPokemon elegirPokemon(EntrenadorBase entrenador,int numero) {
		
		return entrenador.getPokeball(numero);
	}
	
	public void atacar(GestionaPokemon p1,int numero,GestionaPokemon p2) {
		p2.recibirDanio(p1.attack(numero) );
		// verificar que pasa si el pokemon no tienen hp
	}
}