package ar.com.codoacodo.pokemon.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.codoacodo.pokeapi.PokeApi;
import ar.com.codoacodo.pokemon.buscarpokemonapi;

public class MainBatallaPokemon {

	public static List<String> cargarImagenesFront(PokeApi p) {
		List<String> img = new ArrayList<>();
		img.add(p.sprites.other.home.frontShiny);
		img.add(p.sprites.other.home.frontDefault);
		img.add((String) p.sprites.other.home.frontFemale);
		img.add((String) p.sprites.other.home.frontShinyFemale);

		img.add(p.sprites.versions.generationI.redBlue.frontDefault);
		img.add(p.sprites.versions.generationI.redBlue.frontGray);
		img.add(p.sprites.versions.generationI.redBlue.frontTransparent);

		img.add(p.sprites.versions.generationI.yellow.frontDefault);
		img.add(p.sprites.versions.generationI.yellow.frontGray);
		img.add(p.sprites.versions.generationI.yellow.frontTransparent);

		img.add(p.sprites.versions.generationIi.crystal.frontDefault);
		img.add(p.sprites.versions.generationIi.crystal.frontShiny);
		img.add(p.sprites.versions.generationIi.crystal.frontShinyTransparent);
		img.add(p.sprites.versions.generationIi.crystal.frontTransparent);

		img.add(p.sprites.versions.generationIi.gold.frontDefault);
		img.add(p.sprites.versions.generationIi.gold.frontShiny);
		img.add(p.sprites.versions.generationIi.gold.frontTransparent);

		img.add(p.sprites.versions.generationIi.silver.frontDefault);
		img.add(p.sprites.versions.generationIi.silver.frontShiny);
		img.add(p.sprites.versions.generationIi.silver.frontTransparent);

		img.add(p.sprites.versions.generationIii.emerald.frontDefault);
		img.add(p.sprites.versions.generationIii.emerald.frontShiny);

		img.add(p.sprites.versions.generationIii.fireredLeafgreen.frontDefault);
		img.add(p.sprites.versions.generationIii.fireredLeafgreen.frontShiny);

		img.add(p.sprites.versions.generationIii.rubySapphire.frontDefault);
		img.add(p.sprites.versions.generationIii.rubySapphire.frontShiny);

		img.add(p.sprites.versions.generationIv.diamondPearl.frontDefault);
		img.add(p.sprites.versions.generationIv.diamondPearl.frontShiny);
		img.add((String) p.sprites.versions.generationIv.diamondPearl.frontFemale);
		img.add((String) p.sprites.versions.generationIv.diamondPearl.frontShinyFemale);

		img.add(p.sprites.versions.generationIv.heartgoldSoulsilver.frontDefault);
		img.add(p.sprites.versions.generationIv.heartgoldSoulsilver.frontShiny);
		img.add((String) p.sprites.versions.generationIv.heartgoldSoulsilver.frontFemale);
		img.add((String) p.sprites.versions.generationIv.heartgoldSoulsilver.frontShinyFemale);
		

		img.add(p.sprites.versions.generationIv.platinum.frontDefault);
		img.add(p.sprites.versions.generationIv.platinum.frontShiny);
		img.add((String) p.sprites.versions.generationIv.platinum.frontFemale);
		img.add((String) p.sprites.versions.generationIv.platinum.frontShinyFemale);
		
		img.add(p.sprites.versions.generationV.blackWhite.frontDefault);
		img.add(p.sprites.versions.generationV.blackWhite.frontShiny);
		img.add((String) p.sprites.versions.generationV.blackWhite.frontFemale);
		img.add((String) p.sprites.versions.generationV.blackWhite.frontShinyFemale);
		
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.frontDefault);
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.frontShiny);
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.frontFemale);
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.frontShinyFemale);
		
		
		img.add((String) p.sprites.versions.generationVi.omegarubyAlphasapphire.frontDefault);
		img.add((String) p.sprites.versions.generationVi.omegarubyAlphasapphire.frontShiny);
		img.add((String) p.sprites.versions.generationVi.omegarubyAlphasapphire.frontFemale);
		img.add((String) p.sprites.versions.generationVi.omegarubyAlphasapphire.frontShinyFemale);
		
		img.add((String) p.sprites.versions.generationVi.xY.frontDefault);
		img.add((String) p.sprites.versions.generationVi.xY.frontShiny);
		img.add((String) p.sprites.versions.generationVi.xY.frontFemale);
		img.add((String) p.sprites.versions.generationVi.xY.frontShinyFemale);
		
		img.add((String) p.sprites.versions.generationViii.icons.frontDefault);
		img.add((String) p.sprites.versions.generationViii.icons.frontFemale);
		
		img.add((String) p.sprites.frontDefault);
		
		img.add( p.sprites.versions.generationVii.icons.frontDefault);
		img.add( p.sprites.versions.generationVii.ultraSunUltraMoon.frontDefault);
		img.add( p.sprites.versions.generationVii.ultraSunUltraMoon.frontShiny);
		img.add( (String) p.sprites.versions.generationVii.ultraSunUltraMoon.frontFemale);
		img.add( (String) p.sprites.versions.generationVii.ultraSunUltraMoon.frontFemale);
		return img;
	}

	public static List<String> cargarImagenesBack(PokeApi p) {
		List<String> img = new ArrayList<>();
		img.add(p.sprites.versions.generationI.redBlue.backDefault);
		img.add(p.sprites.versions.generationI.redBlue.backGray);
		img.add(p.sprites.versions.generationI.redBlue.backTransparent);

		img.add(p.sprites.versions.generationI.yellow.backDefault);
		img.add(p.sprites.versions.generationI.yellow.backGray);
		img.add(p.sprites.versions.generationI.yellow.backTransparent);

		img.add(p.sprites.versions.generationIi.crystal.backDefault);
		img.add(p.sprites.versions.generationIi.crystal.backShiny);
		img.add(p.sprites.versions.generationIi.crystal.backShinyTransparent);
		img.add(p.sprites.versions.generationIi.crystal.backTransparent);

		img.add(p.sprites.versions.generationIi.gold.backDefault);
		img.add(p.sprites.versions.generationIi.gold.backShiny);

		img.add(p.sprites.versions.generationIi.silver.backDefault);
		img.add(p.sprites.versions.generationIi.silver.backShiny);

		img.add(p.sprites.versions.generationIii.fireredLeafgreen.backDefault);
		img.add(p.sprites.versions.generationIii.fireredLeafgreen.backShiny);

		img.add(p.sprites.versions.generationIii.rubySapphire.backDefault);
		img.add(p.sprites.versions.generationIii.rubySapphire.backShiny);

		img.add(p.sprites.versions.generationIv.diamondPearl.backDefault);
		img.add(p.sprites.versions.generationIv.diamondPearl.backShiny);
		img.add((String) p.sprites.versions.generationIv.diamondPearl.backFemale);
		img.add((String) p.sprites.versions.generationIv.diamondPearl.backShinyFemale);

		img.add(p.sprites.versions.generationIv.heartgoldSoulsilver.backDefault);
		img.add(p.sprites.versions.generationIv.heartgoldSoulsilver.backShiny);
		img.add((String) p.sprites.versions.generationIv.heartgoldSoulsilver.backFemale);
		img.add((String) p.sprites.versions.generationIv.heartgoldSoulsilver.backShinyFemale);

		img.add(p.sprites.versions.generationIv.platinum.backDefault);
		img.add(p.sprites.versions.generationIv.platinum.backShiny);
		img.add((String) p.sprites.versions.generationIv.platinum.backFemale);
		img.add((String) p.sprites.versions.generationIv.platinum.backShinyFemale);

		img.add((String) p.sprites.versions.generationV.blackWhite.animated.backDefault);
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.backShiny);
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.backFemale);
		img.add((String) p.sprites.versions.generationV.blackWhite.animated.backShinyFemale);

		img.add(p.sprites.versions.generationV.blackWhite.backDefault);
		img.add(p.sprites.versions.generationV.blackWhite.backShiny);
		img.add((String) p.sprites.versions.generationV.blackWhite.backFemale);
		img.add((String) p.sprites.versions.generationV.blackWhite.backShinyFemale);

		return img;
	}

	public static void main(String[] args) throws IOException {

		buscarpokemonapi bp = new buscarpokemonapi("https://pokeapi.co/");

		PokeApi b = bp.findUsers(25);

		GestionaPokemon pikachu = new GestionaPokemon(b.name, b.types.get(0).type.name, b.moves, 
				cargarImagenesFront(b), cargarImagenesBack(b), b.stats.get(0).baseStat, b.weight,
				b.stats.get(2).baseStat, b.stats.get(5).baseStat, b.stats.get(4).baseStat, 
				b.stats.get(1).baseStat, b.baseExperience, b.stats.get(1).baseStat);

		//ObjectMapper mapper = new ObjectMapper();
		//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pikachu));

		//pikachu.getImagenesFront().forEach(System.out::println);
		//img.add(p.sprites.other.home.frontShiny);
	//	img.add(p.sprites.other.home.frontDefault);
	//	img.add((String) p.sprites.other.home.frontFemale);
		//img.add((String) p.sprites.other.home.frontShinyFemale
		System.out.println(pikachu.getMoves(1));
		System.out.println(pikachu.getMoves(2));
		System.out.println(pikachu.getMoves(3));
		System.out.println(pikachu.getMoves(4));
		

	}

}
