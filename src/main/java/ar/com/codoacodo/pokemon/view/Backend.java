package ar.com.codoacodo.pokemon.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.base.batallaPokemon;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;
import ar.com.codoacodo.pokemon.items.Revive;

public class Backend {

	private batallaPokemon bp ;
	private Scanner sc = new Scanner (System.in);
	private int turno = (int)(Math.random()*2)+1;
	private EntrenadorBase  entrenadorActivo, entrenadorPasivo;
	private GestionaPokemon pokemonActivo, pokemonPasivo;
	public boolean itemUtilizado;
	private ViewBatalla viewBatalla;
	
	
	public Backend(batallaPokemon p) {
	
		this.bp = p;
		elegirEntrenador();
		elegirPokemonActivo(this.entrenadorActivo.getPokeball(0));//verificar si el pokemon esta vivo
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
	
	
	// primer metodo modificado, falta modificar el resto y desarmar la ligica para
	// que no se ejecute
	public void elegirPokemonActivo(GestionaPokemon pokemon) {

		
			if(this.entrenadorActivo.verificarVidaDeTodosLosPokemon() ) {
				JOptionPane.showMessageDialog(null, "perdedor!!!");
				return;
			}
	
		
		this.pokemonActivo = this.bp.elegirPokemon(this.entrenadorActivo,pokemon);
		
	}
	
	public void elegirPokemonPasivo() {

		this.entrenadorPasivo.getPokemons().forEach(p -> {
			if (!p.estaMuerto()) {
				this.pokemonPasivo = p;
				return;
			}

		});

		if (this.entrenadorPasivo.verificarVidaDeTodosLosPokemon()) {
			JOptionPane.showMessageDialog(null, "perdedor!!!");
			return;
		}
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
		
	
		    this.itemUtilizado = true;
		   
		
			
			
		switch (0) {
		case 1:
			System.out.println("Elige un numero de ataque");
		
		
			opcion = sc.nextInt();
			volverAlMenu(opcion);
		
			bp.atacar(this.pokemonActivo, opcion, this.pokemonPasivo);
			if ( this.pokemonPasivo.estaMuerto() ) {
				elegirPokemonPasivo(); }
			break;
        case 2:
        	//elegirPokemonActivo();
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
			System.out.println("opcion incorrecta ");
			break;
		}
		
		
		
		
		if(this.entrenadorActivo.verificarVidaDeTodosLosPokemon()) {
		
			System.out.println("gano el entrenador "+this.entrenadorPasivo.getName());
		}
		if(this.entrenadorPasivo.verificarVidaDeTodosLosPokemon()) {
		
			System.out.println("gano el entrenador "+this.entrenadorActivo.getName());
		}
		 
		intercambiarEntrenadores();
		
		
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
	
	public EntrenadorBase getEntrenadorActivo() {
		return this.entrenadorActivo;
	}
	
	public GestionaPokemon getPOkemonActivo() {
		return this.pokemonActivo;
	}
	
	public GestionaPokemon getPokemonPasivo() {
		
		return this.pokemonPasivo;
	}

	@Override
	public String toString() {
		return "simuladorDeVentana [bp=" + bp + ", sc=" + sc + ", turno=" + turno + ", entrenadorActivo="
				+ entrenadorActivo + ", entrenadorPasivo=" + entrenadorPasivo + ", pokemonActivo=" + pokemonActivo
				+ ", pokemonPasivo=" + pokemonPasivo + "]";
	}




	
	
}
