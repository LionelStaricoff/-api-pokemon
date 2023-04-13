package ar.com.codoacodo.pokemon.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.codoacodo.pokeapi.PokeApi;


public class GestionaPokemon {

	private String nombre, tipo;
	private List<String> moves = new ArrayList<String>();
	private Collection<String> imagenesFront;
	private Collection<String> imagenesBack;
	private Integer defencePotenciado= 0,AtkPotenciado=0, hp, peso, defence, speed, specialdefence, atack, baseExperiencia, specialAtack;
	private int vidaTotal=0;
	
	public GestionaPokemon(int numero) throws IOException {

		buscarpokemonapi bp = new buscarpokemonapi("https://pokeapi.co/");

		PokeApi b = bp.findUsers(numero);
		
		armarPokemon(b);
		  this.vidaTotal = getHp();
		
	}
	public GestionaPokemon() throws IOException {

		buscarpokemonapi bp = new buscarpokemonapi("https://pokeapi.co/");

		PokeApi b = bp.findUsers();
		
		armarPokemon(b);
		this.vidaTotal = getHp();
		
		
	}
	
	
	
	//PokemonBuilder polimorfismo
	public GestionaPokemon(PokemonBuilder builder) {
		this.nombre = builder.getNombre();
		this.tipo = builder.getTipo();
		this.moves = builder.getMoves();
		this.imagenesFront = builder.getImagenesFront();
		this.imagenesBack = builder.getImagenesBack();
		this.hp = builder.getHp();
		this.peso = builder.getPeso();
		this.defence = builder.getDefence();
		this.speed = builder.getSpeed();
		this.specialdefence = builder.getSpecialdefence();
		this.atack = builder.getAtack();
		this.baseExperiencia = builder.getBaseExperiencia();
		this.specialAtack = builder.getSpecialAtack();
	}
	
	public synchronized static PokemonBuilder builder() {
		return new PokemonBuilder();
	}
	
	
	
	
	
	
	private  void armarPokemon(PokeApi b) {
		this.nombre = b.name;
		this.tipo = b.types.get(0).type.name;
		this.moves = b.moves.stream().map(m-> m.move.name).collect(Collectors.toList());
		this.imagenesFront = cargarImagenesFront(b); 
		this.imagenesBack = cargarImagenesBack(b);
		this.hp = b.stats.get(0).baseStat;
		this.peso =  b.weight;
		this.defence = b.stats.get(2).baseStat;
		this.speed = b.stats.get(5).baseStat;
		this.specialdefence = b.stats.get(4).baseStat;
		this.atack = b.stats.get(1).baseStat;
		this.baseExperiencia = b.baseExperience;
		this.specialAtack = b.stats.get(3).baseStat;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}
	
	

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
	
	public boolean estaMuerto() {
		return (getHp()<1)?true :false;
	}

	public Integer getPeso() {
		return peso;
	}

	public Integer getDefence() {
		return this.defence + this.defencePotenciado;
	}

	public Integer getSpeed() {
		return speed;
	}

	public Integer getSpecialdefence() {
		return this.specialdefence;
	}

	public Integer getAtack() {
		return this.atack + this.AtkPotenciado;
	}

	public Integer getBaseExperiencia() {
		return this.baseExperiencia;
	}

	public Integer getSpecialAtack() {
		return this.specialAtack + this.AtkPotenciado;
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
	this.hp -=  Math.abs(this.defence - danio);
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
	
public int cantidadImgBack() {
	
	return this.imagenesBack.size();
	
}

private static List<String> cargarImagenesFront(PokeApi p) {
	List<String> img = new ArrayList<String>();
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
	
	img.removeAll(Collections.singletonList(null));
	return img ;
}

private static List<String> cargarImagenesBack(PokeApi p) {
	List<String> img = new ArrayList<String>();
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
	
	

	img.removeAll(Collections.singletonList(null));
	return img;
}


    public void setHp(int i) {
	this.hp+=i;
	
}

	@Override
	public String toString() {
		return "GestionaPokemon [nombre=" + nombre + ", tipo=" + tipo + ", moves=" + moves + ", imagenesFront="
				+ imagenesFront + ", imagenesBack=" + imagenesBack + ", hp=" + hp + ", peso=" + peso + ", defence="
				+ defence + ", speed=" + speed + ", specialdefence=" + specialdefence + ", atack=" + atack
				+ ", baseExperiencia=" + baseExperiencia + ", specialAtack=" + specialAtack + "]";
	}
	public int getVidaTotal() {
	
		return this.vidaTotal;
	}
	public void setAtkPotenciado(int i) {
		this.AtkPotenciado += getAtack()*i/100;
		
	}
	public void setDefencePotenciado(int i) {
		this.defencePotenciado += getDefence()*i/100;
		
	}
	
	

	
}


       