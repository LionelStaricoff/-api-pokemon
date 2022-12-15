package ar.com.codoacodo.pokemon.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ar.com.codoacodo.pokeapi.Move;

public class GestionaPokemon {

	private String nombre, tipo;
	private List<String> moves = new ArrayList<>();
	private Collection<String> imagenesFront;
	private Collection<String> imagenesBack;
	private Integer hp, peso, defence, speed, specialdefence, atack, baseExperiencia, specialAtack;

	public GestionaPokemon(String nombre, String tipo, Collection<Move> moves, Collection<String> imagenesFront,
			Collection<String> imagenesBack, Integer hp, Integer peso, Integer defence, Integer speed,
			Integer specialdefence, Integer atack, Integer baseExperiencia, Integer specialAtack) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.moves = moves.stream().map(m-> m.move.name).collect(Collectors.toList());
		this.imagenesFront = imagenesFront;
		this.imagenesBack = imagenesBack;
		this.hp = hp;
		this.peso = peso;
		this.defence = defence;
		this.speed = speed;
		this.specialdefence = specialdefence;
		this.atack = atack;
		this.baseExperiencia = baseExperiencia;
		this.specialAtack = specialAtack;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}
	
	//no funca los moves

	public String getMoves(int n) {
		String nameAtack = "";

		int sum = 0;

		Iterator<String> it = this.moves.iterator();
		while (it.hasNext()) {

			nameAtack = it.next().toString();
			sum++;
			if (n == sum) {
				break;
			}
		}

		return nameAtack;
		}

	public String getImagenesFront(int n) {
		String imgFront = "";

		int sum = 0;

		Iterator<String> it = this.imagenesFront.iterator();
		while (it.hasNext()) {

			imgFront = it.next();
			sum++;
			if (n == sum) {
				break;
			}
		}

		return imgFront;
	}

	public String getImagenesBack(int n) {
		String imgFront = "";

		int sum = 0;

		Iterator<String> it = this.imagenesBack.iterator();
		while (it.hasNext()) {

			imgFront = it.next();
			sum++;
			if (n == sum) {
				break;
			}
		}

		return imgFront;
	}

	public Integer getHp() {
		return hp;
	}

	public Integer getPeso() {
		return peso;
	}

	public Integer getDefence() {
		return defence;
	}

	public Integer getSpeed() {
		return speed;
	}

	public Integer getSpecialdefence() {
		return specialdefence;
	}

	public Integer getAtack() {
		return atack;
	}

	public Integer getBaseExperiencia() {
		return baseExperiencia;
	}

	public Integer getSpecialAtack() {
		return specialAtack;
	}
	
	public int attack(int n) {
		
		System.out.print("atacando con "+getMoves(n)+" ");
		
		return getAtack()+n;
	
		
		
	}
public int specialAttack(int n) {
		
		System.out.print("atacando con "+getMoves(n)+" ");
		
		return getSpecialAtack()+n;
	
		
		
	}

public void recibirDanio (int danio) {
	if (this.hp >0) {
		
		if(this.defence < danio) {
	this.hp -= (this.defence - danio);
		}else {
			
		}this.hp -= 1;
		
	}else {
		System.out.println("El pokemon esta inconciente y no puede pelear");
	}
}

public void recibirDanioSpecial (int danio) {
	if (this.hp >0) {
		
		if(this.specialdefence < danio) {
	this.hp -= (this.specialdefence - danio);
		}else {
			
		}this.hp -= 1;
		
	}else {
		System.out.println("El pokemon esta inconciente y no puede pelear");
	}
}
	

	@Override
	public String toString() {
		return "GestionaPokemon [nombre=" + nombre + ", tipo=" + tipo + ", moves=" + moves + ", imagenesFront="
				+ imagenesFront + ", imagenesBack=" + imagenesBack + ", hp=" + hp + ", peso=" + peso + ", defence="
				+ defence + ", speed=" + speed + ", specialdefence=" + specialdefence + ", atack=" + atack
				+ ", baseExperiencia=" + baseExperiencia + ", specialAtack=" + specialAtack + "]";
	}

}
