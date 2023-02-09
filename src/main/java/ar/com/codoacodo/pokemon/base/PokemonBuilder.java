package ar.com.codoacodo.pokemon.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.codoacodo.user.UsuarioBuilder;

public class PokemonBuilder {

	private String nombre, tipo;
	private List<String> moves = new ArrayList<String>();
	private Collection<String> imagenesFront;
	private Collection<String> imagenesBack;
	private Integer hp, peso, defence, speed, specialdefence, atack, baseExperiencia, specialAtack;
	private static PokemonBuilder pokemonBuilder = new PokemonBuilder();

	public PokemonBuilder() {

	}

	public GestionaPokemon build() {
		GestionaPokemon gestionaPokemon = new GestionaPokemon(pokemonBuilder);
		return gestionaPokemon;
	}

	public PokemonBuilder nombre(String nombre) {
		this.pokemonBuilder.nombre = nombre;
		return this;
	}

	public PokemonBuilder tipo(String tipo) {
		this.pokemonBuilder.tipo = tipo;
		return this;
	}

	public PokemonBuilder moves(List<String> moves) {
		this.pokemonBuilder.moves = moves;
		return this;
	}

	public PokemonBuilder imagenesFront(List<String> imagenesFront) {
		this.pokemonBuilder.imagenesFront = imagenesFront;
		return this;
	}

	public PokemonBuilder imagenesBack(List<String> imagenesBack) {
		this.pokemonBuilder.imagenesBack = imagenesBack;
		return this;
	}

	public PokemonBuilder hp(int hp) {
		this.pokemonBuilder.hp = hp;
		return this;
	}

	public PokemonBuilder peso(int peso) {
		this.pokemonBuilder.peso = peso;
		return this;
	}

	public PokemonBuilder defence(int defence) {
		this.pokemonBuilder.defence = defence;
		return this;
	}

	public PokemonBuilder speed(int speed) {
		this.pokemonBuilder.speed = speed;
		return this;
	}

	public PokemonBuilder specialdefence(int specialdefence) {
		this.pokemonBuilder.specialdefence = specialdefence;
		return this;
	}

	public PokemonBuilder atack(int atack) {
		this.pokemonBuilder.atack = atack;
		return this;
	}

	public PokemonBuilder baseExperiencia(int baseExperiencia) {
		this.pokemonBuilder.baseExperiencia = baseExperiencia;
		return this;
	}

	public PokemonBuilder specialAtack(int specialAtack) {
		this.pokemonBuilder.specialAtack = specialAtack;
		return this;
	}

	// getters

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public List<String> getMoves() {
		return moves;
	}

	public Collection<String> getImagenesFront() {
		return imagenesFront;
	}

	public Collection<String> getImagenesBack() {
		return imagenesBack;
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

}