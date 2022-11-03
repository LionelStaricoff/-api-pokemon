package ar.com.codoacodo.pokemonss;



import ar.com.codoacodo.pokemons.Ataque;

public class Pikachu extends Pokemon{

	public Pikachu() {
		super("electrico", "pikachu", 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aprenderAtaque(Ataque ataque) {
		ataques.add(new Ataque("agilidad",10) );
		ataques.add(new Ataque("cola de hierro" ,15) );
		ataques.add(new Ataque("rueno",20) );
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
