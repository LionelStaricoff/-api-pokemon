package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.item.Item;

public abstract class Items implements utilizable {

	protected String name,img;
	protected int cost,idNumber,cantidad;
	
	
	
	public Items(int id) {
	
		this.idNumber = id;
		BuscaItem bi = new BuscaItem (this.idNumber);
		Item i = bi.findItem();
		 this.name = i.name;
		 this.img = i.sprites._default;
		 this.cost = i.cost;
		
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

	
	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	public void consumirItem(){
		if(this.cantidad>1) {
			 this.cantidad--;
		}else {
			System.out.println("No tenes item");
			this.cantidad = 0;
		}
		
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", img=" + img + ", cost=" + cost + ", idNumber=" + idNumber + ", cantidad="
				+ cantidad + "]";
	}

	
	
	
}

