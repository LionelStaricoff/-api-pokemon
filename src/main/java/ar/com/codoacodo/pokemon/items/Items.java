package ar.com.codoacodo.pokemon.items;

public abstract class Items {

	protected String name,img;
	protected int cost,idNumber;
	
	
	
	public Items(int id) {
	
		this.idNumber = id;
	}

	public String getName() {
		return name;
	}
	
	public String getImg() {
		return img;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	@Override
	public String toString() {
		return "Items [name=" + name + ", img=" + img + ", cost=" + cost + ", idNumber=" + idNumber + "]";
	}
	
	
	
}

