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
		elegirEntrenador();
		elegirPokemonActivo();
		elegirPokemonPasivo();
	}

	
	
	public void  elegirEntrenador() {
		if(turno == 1) {
			turno = 2;
		 this.entrenadorActivo = this.bp.getEntrenador1();
		 this.entrenadorPasivo = this.bp.getEntrenador2();
	}else {
			turno = 1;
			 this.entrenadorActivo = this.bp.getEntrenador2();
			 this.entrenadorPasivo = this.bp.getEntrenador1();
	}
	}
	
	public void elegirPokemonActivo() {
		do {
			if(this.entrenadorActivo.verificarVidaDeTodosLosPokemon() ) {
				System.out.println("game over");
				return;
			}
			int pokemon;
			
			do {
				System.out.println("");
		System.out.println(" numero de pokemon a sacar,\n verifica que este vivo");
		System.out.println(this.entrenadorActivo.getName()+" tiene "+this.entrenadorActivo.cantidadPokemon()+" pokemon");
		    pokemon = sc.nextInt()-1;
		    
		    if(pokemon<0) pokemon=0;
		    
			}while(this.entrenadorActivo.cantidadPokemon() <= pokemon );
		
		this.pokemonActivo = this.bp.elegirPokemon(this.entrenadorActivo,pokemon);
		}while(this.pokemonActivo.estaMuerto());
		System.out.println(this.entrenadorActivo.getName()+" llama a " 
		+this.pokemonActivo.getNombre()+" y sale a pelear");
		
	}
	
	public void elegirPokemonPasivo() {
		
		
		do {
			if(this.entrenadorPasivo.verificarVidaDeTodosLosPokemon() ) {
				System.out.println("game over");
				return;
			}
			int pokemon;
			do {
				System.out.println("");
				System.out.println(" numero de pokemon a sacar,\n verifica que este vivo");
				System.out.println(this.entrenadorPasivo.getName()+" tiene "+this.entrenadorPasivo.cantidadPokemon()+" pokemon");
				   pokemon = sc.nextInt()-1;
		    
		    if(pokemon<0) pokemon=0;
		    
			}while(this.entrenadorPasivo.cantidadPokemon() <= pokemon );
			
		this.pokemonPasivo = this.bp.elegirPokemon(this.entrenadorPasivo,pokemon);
		}while(this.pokemonPasivo.estaMuerto());
		System.out.println(this.entrenadorPasivo.getName()+" llama a " 
		+this.pokemonPasivo.getNombre()+" y sale a pelear");
		
	}
		
	
	public void intercambiarEntrenadores() {
		EntrenadorBase entrenadorAux;
		entrenadorAux = this.entrenadorActivo;
		this.entrenadorActivo = this.entrenadorPasivo;
		this.entrenadorPasivo = entrenadorAux;
		intercambiarPokemon();
	}
	
	public void intercambiarPokemon() {
		GestionaPokemon pokemonAux;
		pokemonAux = this.pokemonActivo;
		this.pokemonActivo = this.pokemonPasivo;
		this.pokemonPasivo = pokemonAux;
		
	}
	public void menu() {
			int opcion;
			int opcionMenu;
		do {
			
			System.out.println("");
			System.out.println("Entrenador activo: "+this.entrenadorActivo.getName());
			System.out.println("pokemon activo: "+this.pokemonActivo.getNombre()+" "+this.pokemonActivo.getHp()+" hp");
			System.out.println("Entrenador pasivo: "+this.entrenadorPasivo.getName());
			System.out.println("pokemon pasivo: "+this.pokemonPasivo.getNombre()+" "+this.pokemonPasivo.getHp()+" hp");
			System.out.println("");
			
			System.out.println("opsion 1: Atacar");
			System.out.println("opsion 2: Cambiar polemon");
			System.out.println("opsion 3: Elegir item");
			opcionMenu = sc.nextInt();
		switch (opcionMenu) {
		case 1:
			System.out.println("Elige un numero de ataque");
			opcion = sc.nextInt();
			bp.atacar(this.pokemonActivo, opcion, this.pokemonPasivo);
			if ( this.pokemonPasivo.estaMuerto() ) {
				elegirPokemonPasivo(); }
			break;
        case 2:
        	elegirPokemonActivo();
			break;
         case 3:
        	 this.entrenadorActivo.imprimirItems();
        	 if( this.entrenadorActivo.tieneItems()) {
        	 System.out.println("elige el nuemero del item");
 			 opcion = sc.nextInt();
 			 if(this.entrenadorActivo.getItem(opcion)!=null) {
 			this.entrenadorActivo.getItem(opcion);
 			   }
        	 }
			break;

		default:
			System.out.println("opsion incorrecta ");
			break;
		}
		if(this.entrenadorActivo.verificarVidaDeTodosLosPokemon()) {
			opcionMenu=4;
			System.out.println("gano el entrenador "+this.entrenadorPasivo.getName());
		}
		if(this.entrenadorPasivo.verificarVidaDeTodosLosPokemon()) {
			opcionMenu=4;
			System.out.println("gano el entrenador "+this.entrenadorActivo.getName());
		}
		intercambiarEntrenadores();
		} while (opcionMenu ==1 || opcionMenu ==2 || opcionMenu ==3 );
	}



	@Override
	public String toString() {
		return "simuladorDeVentana [bp=" + bp + ", sc=" + sc + ", turno=" + turno + ", entrenadorActivo="
				+ entrenadorActivo + ", entrenadorPasivo=" + entrenadorPasivo + ", pokemonActivo=" + pokemonActivo
				+ ", pokemonPasivo=" + pokemonPasivo + "]";
	}
	
	
}
