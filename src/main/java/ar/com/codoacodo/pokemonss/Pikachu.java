package ar.com.codoacodo.pokemonss;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ar.com.codoacodo.pokeapi.Move;
import ar.com.codoacodo.pokemons.Ataque;

public class Pikachu<t> extends Pokemon{

	public Pikachu() {
		super("electrico", "pikachu", 100);
		ataques.add(new Ataque("agilidad",10) );
		ataques.add(new Ataque("cola de hierro" ,15) );
		ataques.add(new Ataque("rueno",20) );
	}

	@Override
	public void aprenderAtaque(Ataque ataque) {
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

	@Override
	public void aprenderAtaque(List ataque) {
	
     
		ataque.forEach((e)-> ataques.add((Ataque) e));
	
	//ataques.addAll(Arrays.asList(a));
	//ataques.addAll(a.stream().map(r->r.getNombre() ).collect(Collectors.toSet()) );
		
	}

	public void recorrerAtaques() {
		for (Ataque at: ataques) {
			System.out.println(at.getNombre());
		}
	}
   
	
}
