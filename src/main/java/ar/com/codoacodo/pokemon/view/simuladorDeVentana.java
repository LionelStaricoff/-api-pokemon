package ar.com.codoacodo.pokemon.view;

import java.util.List;
import java.util.Scanner;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;
import ar.com.codoacodo.pokemon.items.Items;
import ar.com.codoacodo.pokemon.items.Revive;

public class simuladorDeVentana {

	private batallaPokemon bp ;
	private Scanner sc = new Scanner (System.in);
	private int turno = (int)(Math.random()*2)+1;
	private EntrenadorBase  entrenadorActivo, entrenadorPasivo;
	private GestionaPokemon pokemonActivo, pokemonPasivo;
	public boolean itemUtilizado;
	
	
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
		this.entrenadorActivo.listarPokemon();
		//volver al menu
		System.out.println("presiona -1 para volver al menu"); 
		pokemon = sc.nextInt();
		volverAlMenu(pokemon); 
		
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
		if (this.itemUtilizado) {
		EntrenadorBase entrenadorAux;
		entrenadorAux = this.entrenadorActivo;
		this.entrenadorActivo = this.entrenadorPasivo;
		this.entrenadorPasivo = entrenadorAux;
		intercambiarPokemon();
		}
		
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
		    this.itemUtilizado = true;
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
		
			//volver al menu
			System.out.println("presiona -1 para volver al menu"); 
			opcion = sc.nextInt();
			volverAlMenu(opcion);
		
			bp.atacar(this.pokemonActivo, opcion, this.pokemonPasivo);
			if ( this.pokemonPasivo.estaMuerto() ) {
				elegirPokemonPasivo(); }
			break;
        case 2:
        	elegirPokemonActivo();
			break;
         case 3:
        	 
        	 if( this.entrenadorActivo.tieneItems()) {
        		 this.entrenadorActivo.imprimirItems();
        		 System.out.println("elige el numero del item");
        		
        		 //volver al menu
     			System.out.println("presiona -1 para volver al menu"); 
     			opcion = sc.nextInt();
     			volverAlMenu(opcion);
 			
 			 if(this.entrenadorActivo.getItemExiste(opcion)) {
 				 
 				 //verificar si es revive 
 				 if(entrenadorActivo.getItem(opcion).equals(new Revive())) {
 					
 					 //se agrega verificacion para saber si teine cantidad para usar
 					 if(entrenadorActivo.getItem(opcion).getCantidad()==0) {
 						 System.out.println("Compra mas Revive porque ya no ten quedan.");
 					     break;
 					 }
 					 usarRevive(opcion);
 					break;
 				 }
 				 
 				 // usa los otros items menos revive
 				this.entrenadorActivo.listarPokemon();
 				System.out.println("Elige el pokemon ");
 				opcion = sc.nextInt();
 			this.entrenadorActivo.utilizarItem(opcion, pokemonActivo,this.itemUtilizado);
 			   }else {
 				   System.out.println("opsion incorrecta");
 				  menu();
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
		
		} while (opcionMenu ==1 || opcionMenu ==2 || opcionMenu ==3);
	}

	private void usarRevive(int numeroItem) {
	// imprime los pokemon muertos
		
		this.entrenadorActivo.listarPokemonMuertos().forEach((p)->{
			int count = 0;
			System.out.println("opción: "+ count++ +" " +p.getNombre());
		
		});
		//verificar que la lista no este vacia
		boolean pokemonMuertos = this.entrenadorActivo.listarPokemonMuertos().isEmpty() ;
		int key = 0;	
		if (pokemonMuertos == true) {
			key=1;
			}
		
		switch (key) {
		case 1:
			System.out.println("No tenes pokemon muertos.");
			this.itemUtilizado = false;
			break;

		default:
			System.out.println("elija el pokemon a revivir");
			int opsion = sc.nextInt();
			if(this.entrenadorActivo.getPokeball(opsion)!=null) {
				
		        entrenadorActivo.utilizarItem(numeroItem, this.entrenadorActivo.getPokeball(opsion), this.itemUtilizado);
			
			  
			}else {
				System.out.println("opsion no valida");
				usarRevive(numeroItem);
		}
		
		
		}
		
		
		
		
	}

	private void volverAlMenu(int numero) {
		if(numero == -1) {
		 this.itemUtilizado = false;
    	 menu();
		}
	}

	@Override
	public String toString() {
		return "simuladorDeVentana [bp=" + bp + ", sc=" + sc + ", turno=" + turno + ", entrenadorActivo="
				+ entrenadorActivo + ", entrenadorPasivo=" + entrenadorPasivo + ", pokemonActivo=" + pokemonActivo
				+ ", pokemonPasivo=" + pokemonPasivo + "]";
	}
	
	
}
