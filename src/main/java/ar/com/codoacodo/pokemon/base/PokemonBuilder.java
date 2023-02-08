package ar.com.codoacodo.pokemon.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public  class PokemonBuilder {

	private String nombre, tipo;
	private List<String> moves = new ArrayList<String>();
	private Collection<String> imagenesFront;
	private Collection<String> imagenesBack;
	private Integer hp, peso, defence, speed, specialdefence, atack, baseExperiencia, specialAtack;
	
	
	
	public PokemonBuilder() {
		
	}
	
	
	
	
	
	
	public GestionaPokemon build() {
		GestionaPokemon gestionaPokemon = new GestionaPokemon(this);
		return gestionaPokemon;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public  void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public  void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<String> getMoves() {
		return moves;
	}
	public void setMoves(List<String> moves) {
		this.moves = moves;
	}
	public Collection<String> getImagenesFront() {
		return imagenesFront;
	}
	public void setImagenesFront(Collection<String> imagenesFront) {
		this.imagenesFront = imagenesFront;
	}
	public Collection<String> getImagenesBack() {
		return imagenesBack;
	}
	public void setImagenesBack(Collection<String> imagenesBack) {
		this.imagenesBack = imagenesBack;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Integer getDefence() {
		return defence;
	}
	public void setDefence(Integer defence) {
		this.defence = defence;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getSpecialdefence() {
		return specialdefence;
	}
	public void setSpecialdefence(Integer specialdefence) {
		this.specialdefence = specialdefence;
	}
	public Integer getAtack() {
		return atack;
	}
	public void setAtack(Integer atack) {
		this.atack = atack;
	}
	public Integer getBaseExperiencia() {
		return baseExperiencia;
	}
	public void setBaseExperiencia(Integer baseExperiencia) {
		this.baseExperiencia = baseExperiencia;
	}
	public Integer getSpecialAtack() {
		return specialAtack;
	}
	public void setSpecialAtack(Integer specialAtack) {
		this.specialAtack = specialAtack;
	}

}
