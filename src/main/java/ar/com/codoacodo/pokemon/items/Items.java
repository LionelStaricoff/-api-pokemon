package ar.com.codoacodo.pokemon.items;

public abstract class Items {

	private String name;
	
	public Items(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + "]";
	}
	
	
}
