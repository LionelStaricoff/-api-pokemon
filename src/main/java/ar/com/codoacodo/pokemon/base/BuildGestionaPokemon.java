package ar.com.codoacodo.pokemon.base;

import java.util.List;

public interface BuildGestionaPokemon {

	public void nombre(String nombre);

	public void tipo(String tipo);

	public void moves(List<String> moves);

	public void imagenesFront(List<String> imagenesFront);

	public void imagenesBack(List<String> imagenesBack);

	public void hp(int hp);

	public void peso(int peso);

	public void defence(int defence);

	public void speed(int speed);

	public void specialdefence(int specialdefence);

	public void atack(int atack);

	public void baseExperiencia(int baseExperiencia);

	public void specialAtack(int specialAtack);
	
	public GestionaPokemon build();
		
	

}
