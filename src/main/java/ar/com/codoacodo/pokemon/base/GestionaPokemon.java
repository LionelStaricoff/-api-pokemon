package ar.com.codoacodo.pokemon.base;

import java.util.Collection;
import java.util.Iterator;

import ar.com.codoacodo.pokeapi.Move;

public class GestionaPokemon {

	private String nombre, tipo;
	private Collection<Move> moves;
	private Collection<String> imagenesFront;
	private Collection<String> imagenesBack;
	private Integer hp, peso, defence, speed, specialdefence, atack, baseExperiencia, specialAtack;

	public GestionaPokemon(String nombre, String tipo, Collection<Move> moves, Collection<String> imagenesFront,
			Collection<String> imagenesBack, Integer hp, Integer peso, Integer defence, Integer speed,
			Integer specialdefence, Integer atack, Integer baseExperiencia, Integer specialAtack) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.moves = moves;
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
		String imgFront = "";

		int sum = 0;

		Iterator<Move> it = this.moves.iterator();
		while (it.hasNext()) {

			imgFront = it.next().toString();
			sum++;
			if (n == sum) {
				break;
			}
		}

		return imgFront;
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

	@Override
	public String toString() {
		return "GestionaPokemon [nombre=" + nombre + ", tipo=" + tipo + ", moves=" + moves + ", imagenesFront="
				+ imagenesFront + ", imagenesBack=" + imagenesBack + ", hp=" + hp + ", peso=" + peso + ", defence="
				+ defence + ", speed=" + speed + ", specialdefence=" + specialdefence + ", atack=" + atack
				+ ", baseExperiencia=" + baseExperiencia + ", specialAtack=" + specialAtack + "]";
	}

}
