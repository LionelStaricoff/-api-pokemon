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
	
	
	public GestionaPokemon elegirPokemon(EntrenadorBase entrenador,GestionaPokemon pokemonAcambiar) {
		int numero = 0;
		var pokemons  = entrenador.getPokemons();
		for(var p  :pokemons){
			if(p.getNombre()==pokemonAcambiar.getNombre()) {
				break;
			}
			numero++;
		};
		return entrenador.getPokeball(numero);
	}
	
	public void atacar(GestionaPokemon p1,int numeroDelAtake,GestionaPokemon p2) {
		p2.recibirDanio(p1.attack(numeroDelAtake) );
		System.out.println("atacando "+ p1.getNombre()+ ", recive daño "+p2.getNombre());
		System.out.println(p2.getNombre()+" le queda de hp "+p2.getHp());
	}

	
	public EntrenadorBase getEntrenador1() {
		return entrenador1;
	}

	
	public EntrenadorBase getEntrenador2() {
		return entrenador2;
	}

	

	
	
}