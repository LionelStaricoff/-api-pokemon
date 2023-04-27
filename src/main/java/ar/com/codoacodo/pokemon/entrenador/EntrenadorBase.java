package ar.com.codoacodo.pokemon.entrenador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.items.Items;

public class EntrenadorBase {
	
	private ArrayList <GestionaPokemon> pokeball = new ArrayList<>();
	private List <Items> Items = new ArrayList<>();
	private String name;
	
	public boolean meQuedanPokemon() {
		Iterator<GestionaPokemon> lista = this.pokeball.iterator();
			while(lista.hasNext()) {
				
				if(!verificarVida(lista.next())) {
					return true;
			}
			}
					
				return false;
			
			
	}
	public boolean verificarVidaDeTodosLosPokemon() {
		List<GestionaPokemon> po = this.pokeball.stream().filter(p -> p.estaMuerto()!=true).collect(Collectors.toList());
	
		return po.isEmpty();
	}
	
	public boolean verificarVida(GestionaPokemon p) {
		return (p.getHp()<1)?true :false;
	}
	
	public EntrenadorBase(String name) {
	
		this.name = name;
	}

	public GestionaPokemon getPokeball(int poke) {
		// colocar null exception
		return this.pokeball.get(poke);
	}

	public void setPokeball(GestionaPokemon poke) {
		this.pokeball.add(poke);
	}

	public boolean getItemExiste(int it) {
		if(this.Items.size()>=it && it>=0) {
			return true;
		}
		return false;
	}
	public Items getItem(int it) {
		return this.Items.get(it);
	}

	public void setItem(Items item) {
		this.Items.add(item);
	}
	
	public int cantidadPokemon() {
		return this.pokeball.size();
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "EntrenadorBase [pokeball=" + pokeball + ", item=" + Items + ", name=" + name + "]";
	}
	
	
	
	
	public void imprimirItems() {
		if(this.Items.isEmpty()) {
			System.out.println("no tenes items");
		}else {
			int numero = 0;
			for ( Items item : this.Items) {
				System.out.println("opsion "+numero + ": "+ item.getName()+
						" cantidad: "+ item.getCantidad());
			numero++;
			}
			
			
        	 }
		}
	public boolean tieneItems() {
		
		return !this.Items.isEmpty();
	}
	
	
	
	public void utilizarItem(int numeroItem, GestionaPokemon Pokemon) {
		//manejar el tema del revive que debe buscar un pokemon
		// no activo
		
		Items item = getItem(numeroItem);
		item.consumirItem();
		item.utilizar(Pokemon);
	}
		
	}

	

