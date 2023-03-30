package ar.com.codoacodo.pokemon.items;
public enum EnumItem {
	POCION(17),
	SUPERPOCION(26),
	HIPERPOCION(25),
	REVIVE(28),
	MAXHP(5),
	MAXATK(57),
	MAXDEF(58),
	MAXSPECIALATTAK(61),
	MAXSPECIALDEFFENCE(62);
		
		
		private int key;
		
			private  EnumItem(int key) {
			 this.key = key;
			 	
			}
		public int getKey() {
			return this.key;
		}
		
	
	
		
}