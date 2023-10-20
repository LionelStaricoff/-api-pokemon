package ar.com.codoacodo.pokemon.main;

import java.io.IOException;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;
import ar.com.codoacodo.pokemon.items.MaxAttack;
import ar.com.codoacodo.pokemon.items.Posion;
import ar.com.codoacodo.pokemon.items.Revive;
import ar.com.codoacodo.pokemon.items.SuperPosion;
import ar.com.codoacodo.pokemon.view.ViewBatalla;
import ar.com.codoacodo.pokemon.view.backend;
import ar.com.codoacodo.pokemon.view.simuladorDeVentana;



public class MainBatallaPokemon {


	public static void main(String[] args) throws IOException {

		
		
		GestionaPokemon pikachu = new GestionaPokemon(25);
		GestionaPokemon pokeMisterioso = new GestionaPokemon();
		

				
		GestionaPokemon pokeMisterioso1 = new GestionaPokemon();
		GestionaPokemon pokeMisterioso2 = new GestionaPokemon();
		System.out.println(pokeMisterioso1.getNombre() +" "+pokeMisterioso2.getNombre());
		
		
		
		EntrenadorBase entrenador = new EntrenadorBase("lio");
		entrenador.setPokeball(pokeMisterioso);
		entrenador.setPokeball(pikachu);
		entrenador.setItem(new Posion());
		entrenador.setItem(new Revive());
		entrenador.setItem(new MaxAttack());
		System.out.println("tengo "+entrenador.cantidadPokemon()+" pokemon");
		System.out.println(entrenador.getPokeball(0).getNombre());
		System.out.println(entrenador.getPokeball(1).getNombre());
		
		
		EntrenadorBase entrenador2 = new EntrenadorBase("agus");
		entrenador2.setPokeball(pokeMisterioso1);
		entrenador2.setPokeball(pokeMisterioso2);
		entrenador2.setItem(new Revive());
		entrenador2.setItem(new Posion());
		entrenador2.setItem(new SuperPosion());
		System.out.println("tengo "+entrenador2.cantidadPokemon()+" pokemon");
		System.out.println(entrenador2.getPokeball(0).getNombre());
		System.out.println(entrenador2.getPokeball(1).getNombre());

		
		
		
		//batallaPokemon bp = new batallaPokemon(entrenador, entrenador2);
		
	
		var ventana = new backend(new batallaPokemon(entrenador, entrenador2));
		
		new ViewBatalla(ventana);
		//ventana.menu();
		
		
	}
	

}
