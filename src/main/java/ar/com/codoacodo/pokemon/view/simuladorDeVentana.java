package ar.com.codoacodo.pokemon.view;

import java.util.Scanner;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;

public class simuladorDeVentana {

	private batallaPokemon bp ;
	private Scanner sc = new Scanner (System.in);
	private int turno = (int)(Math.random()*2)+1;
	private EntrenadorBase  entrenadorActivo, entrenadorPasivo;
	private GestionaPokemon pokemonActivo, pokemonPasivo;
	
	
	public simuladorDeVentana(batallaPokemon p) {
	
		this.bp = p;
	}
	//menu batalla
/*
	
	do {
		
		System.out.println("opción 1: elegir pokemon");
		int opcion = sc.nextInt();
		
		System.out.println("opción 2: atacar");
		opcion = sc.nextInt();
		
		System.out.println("opción 3: elegir cambiar pokemon");
		opcion = sc.nextInt();
		
		System.out.println("opción 3: elegir item");
		opcion = sc.nextInt();
		
		
		switch (opcion) {
		case 1:
			System.out.println(entrenador.getName()+": introduce el numero de pokemon a pelear");
			opcion = sc.nextInt();
			GestionaPokemon poke1 =bp.elegirPokemon(entrenador, opcion);
			
			System.out.println(entrenador2.getName()+": introduce el numero de pokemon a pelear");
			opcion = sc.nextInt();
			GestionaPokemon poke21 =bp.elegirPokemon(entrenador, opcion);
			
			break;

		default:
			System.out.println("opción incorrecta");
		}
		
	} while (entrenador.meQuedanPokemon() && entrenador2.meQuedanPokemon() );
}
*/
	
	
	public void  elegirEntrenador() {
		if(turno == 1) {
			turno = 2;
		 this.entrenadorActivo = this.bp.getEntrenador1();
	}else {
			turno = 1;
			 this.entrenadorActivo = this.bp.getEntrenador2();
	}
	}
	
	public void elegirPokemonActivo() {
		do {
			if(this.entrenadorActivo.verificarVidaDeTodosLosPokemon() ) {
				System.out.println("game over, gano el jugador"+ this.entrenadorPasivo.getName());
				return;
			}
		System.out.println("numero de pokemon a sacar, verifica que este vivo");
		int pokemon = sc.nextInt();
		this.pokemonActivo = this.bp.elegirPokemon(this.entrenadorActivo,pokemon);
		}while(!this.pokemonActivo.estaMuerto());
		System.out.println(this.entrenadorActivo+" llama a " 
		+this.pokemonActivo.getNombre()+" y sale a pelear");
		
	}
	
	public void elegirPokemonPasivo() {
		
		
		do {
			if(this.entrenadorActivo.verificarVidaDeTodosLosPokemon() ) {
				System.out.println("game over, gano el jugador"+ this.entrenadorPasivo.getName());
				return;
			}
		System.out.println("numero de pokemon a sacar, verifica que este vivo");
		int pokemon = sc.nextInt();
		this.pokemonPasivo = this.bp.elegirPokemon(this.entrenadorPasivo,pokemon);
		}while(!this.pokemonPasivo.estaMuerto());
		System.out.println(this.entrenadorPasivo+" llama a " 
		+this.pokemonPasivo.getNombre()+" y sale a pelear");
		
	}
		
	
	public void intercambiarEntrenadores() {
		EntrenadorBase entrenadorAux;
		entrenadorAux = this.entrenadorActivo;
		this.entrenadorActivo = this.entrenadorPasivo;
		this.entrenadorPasivo = entrenadorAux;
	}
	
	public void intercambiarPokemon() {
		GestionaPokemon pokemonAux;
		pokemonAux = this.pokemonActivo;
		this.pokemonActivo = this.pokemonPasivo;
		this.pokemonPasivo = pokemonAux;
		
	}
	public void menu() {
		
		int opcion;
		
		do {
			System.out.println("opsion 1: Atacar");
			System.out.println("opsion 2: Cambiar polemon");
			System.out.println("opsion 3: Elegir item");
			opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Elige un numero de ataque");
			opcion = sc.nextInt();
			bp.atacar(this.pokemonActivo, opcion, this.pokemonPasivo);
			if ( this.pokemonPasivo.estaMuerto() ) {
				elegirPokemonPasivo(); }
			else {
			break;}
			break;
        case 2:
        	elegirPokemonActivo();
			break;
         case 3:
        	 System.out.println("elige el nuemero del item");
 			opcion = sc.nextInt();
 			this.entrenadorActivo.getItem(opcion);
			break;

		default:
			System.out.println("opsion incorrecta ");
			break;
		}
		} while (opcion ==1 || opcion ==2 || opcion ==3 );
	}
}
