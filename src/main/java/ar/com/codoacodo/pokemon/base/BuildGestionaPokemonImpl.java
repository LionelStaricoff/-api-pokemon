package ar.com.codoacodo.pokemon.base;

import java.io.IOException;
import java.util.List;

public class BuildGestionaPokemonImpl implements BuildGestionaPokemon {

	// patron de diseño singelton
	private static BuildGestionaPokemonImpl bgp;
	private String nombre = null, tipo= null;
	private List<String> moves = null;
	private List<String> imagenesFront = null;
	private List<String> imagenesBack = null;
	private Integer hp= null, peso= null, defence= null, 
			speed= null, specialdefence= null, atack= null
			, baseExperiencia= null, specialAtack= null;

	public BuildGestionaPokemonImpl() {
	
	}

	public synchronized static  BuildGestionaPokemonImpl buildInicial() {
		if (bgp == null) {
			bgp = new BuildGestionaPokemonImpl();
		}
		return bgp;
	}
	
	@Override
	public  void nombre(String nombre) {
		this.nombre = nombre;
		

	}

	@Override
	public void tipo(String tipo) {
		this.tipo = tipo;

	}

	@Override
	public void moves(List<String> moves) {
		this.moves = moves;

	}

	@Override
	public void imagenesFront(List<String> imagenesFront) {
		this.imagenesFront = imagenesFront;

	}

	@Override
	public void imagenesBack(List<String> imagenesBack) {
		this.imagenesBack = imagenesBack;

	}

	@Override
	public void hp(int hp) {
		this.hp = hp;

	}

	@Override
	public void peso(int peso) {
		this.peso = peso;

	}

	@Override
	public void defence(int defence) {
		this.defence = defence;

	}

	@Override
	public void speed(int speed) {
		this.speed = speed;

	}

	@Override
	public void specialdefence(int specialdefence) {
		this.specialdefence = specialdefence;

	}

	@Override
	public void atack(int atack) {
		this.atack = atack;

	}

	@Override
	public void baseExperiencia(int baseExperiencia) {
		this.baseExperiencia = baseExperiencia;

	}

	@Override
	public void specialAtack(int specialAtack) {
		this.specialAtack = specialAtack;

	}

	@Override
	public GestionaPokemon build() {

		return  new GestionaPokemon(this.nombre, this.tipo, this.moves, this.imagenesFront, this.imagenesBack, this.hp,
				this.peso, this.defence, this.speed, this.specialdefence, this.atack, this.baseExperiencia,
				this.specialAtack);
	}

}
