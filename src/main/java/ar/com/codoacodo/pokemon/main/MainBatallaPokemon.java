package ar.com.codoacodo.pokemon.main;

import java.io.IOException;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;
import ar.com.codoacodo.pokemon.items.MaxAttack;
import ar.com.codoacodo.pokemon.items.Posion;
import ar.com.codoacodo.pokemon.items.Revive;
import ar.com.codoacodo.pokemon.items.SuperPosion;
import ar.com.codoacodo.pokemon.view.simuladorDeVentana;



public class MainBatallaPokemon {


	public static void main(String[] args) throws IOException {


		
		
		
		// 
		
		
		
		
		GestionaPokemon pikachu = new GestionaPokemon(25);
		GestionaPokemon pokeMisterioso = new GestionaPokemon();
		

		/*
		System.out.println( pikachu);
		System.out.println(pokeMisterioso);
		
		
		//provando el UsuarioBuilder para construir pokemon
		
		
		 List<String> moves = new ArrayList<String>();
		 List<String> imagenesFront = new ArrayList<String>();
		 List<String> imagenesBack = new ArrayList<String>();
		 
		 moves.add(pikachu.getMoves(5));
		 moves.add(pikachu.getMoves(10));
		 moves.add(pikachu.getMoves(15));
		 
		 imagenesFront.add(pikachu.getImagenesFront(0));
		 imagenesFront.add(pikachu.getImagenesFront(2));
		 imagenesFront.add(pikachu.getImagenesFront(3));
		 
		 imagenesBack.add(pikachu.getImagenesBack(0));
		 imagenesBack.add(pikachu.getImagenesBack(2));
		 imagenesBack.add(pikachu.getImagenesBack(3));
		 
	
		pokeMisterioso = GestionaPokemon.builder()
				.atack(pikachu.getAtack())
				.nombre(pikachu.getNombre())
				.tipo(pikachu.getTipo())
				.hp(pikachu.getHp())
				.peso(pikachu.getPeso())
				.defence(pikachu.getDefence())
				.speed(pikachu.getSpeed())
				.specialdefence(pikachu.getSpecialdefence())
				.atack(pikachu.getAtack())
				.baseExperiencia(pikachu.getBaseExperiencia())
				.specialAtack(pikachu.getSpecialAtack())
				.moves(moves)
				.imagenesFront(imagenesFront)
				.imagenesBack(imagenesBack)
				.build();
		
		
		System.out.println(pokeMisterioso);
		
		
	
		
		*/
		
		
		
		
		
		
		
				
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
		
	
		simuladorDeVentana ventana = new simuladorDeVentana(new batallaPokemon(entrenador, entrenador2));
		
		ventana.menu();
		
		
	}
	

}
