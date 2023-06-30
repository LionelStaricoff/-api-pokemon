package ar.com.codoacodo.pokemon.items;

import ar.com.codoacodo.item.Item;

public abstract class Items implements utilizable {

	protected String name, img;
	protected int cost, idNumber, cantidad = 1;

	public Items(int id) {

		this.idNumber = id;
		BuscaItem bi = new BuscaItem(this.idNumber);
		Item i = bi.findItem();
		this.name = i.name;
		this.img = i.sprites._default;
		this.cost = i.cost;

	}

	// para comprar varios itmes
	public Items(int id, int compra) {

		this.idNumber = id;
		BuscaItem bi = new BuscaItem(this.idNumber);
		Item i = bi.findItem();
		this.name = i.name;
		this.img = i.sprites._default;
		this.cost = i.cost;
		this.cantidad += compra - 1;
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

	public void consumirItem() {
		if (this.cantidad > 0) {
			this.cantidad--;
		} else {
			System.out.println("No te queda mas " + this.name);
			this.cantidad = 0;
		}

	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", img=" + img + ", cost=" + cost + ", idNumber=" + idNumber + ", cantidad="
				+ cantidad + "]";
	}

	@Override
	public boolean equals(Items item) {

		return this.getClass() == item.getClass();
	}

	public boolean equalsCurables() {

		return this.getIdNumber() == EnumItem.POCION.getKey() || this.getIdNumber() == EnumItem.REVIVE.getKey()
				|| this.getIdNumber() == EnumItem.SUPERPOCION.getKey()
				|| this.getIdNumber() == EnumItem.HIPERPOCION.getKey();

	}
}
