package ar.com.codoacodo.pokemonss;



import ar.com.codoacodo.pokemons.Ataque;

public class Charizard extends Pokemon{

	public Charizard() {
		super("fuego", "charizard", 150);
		ataques.add(new Ataque("lanzallamas",5) );
		}
	

	@Override
	public void aprenderAtaque(Ataque ataque) {
		ataques.clear();
		ataques.add(ataque);
		
	}
	

	@Override
	public int atacar() {
		int contador=0;
		for (Ataque at: ataques) {
			contador+=at.getPuntoAtaque();
		}
		return contador;
	}
   
	
}
