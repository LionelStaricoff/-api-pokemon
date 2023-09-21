package ar.com.codoacodo.enums;

public enum Fondos {
	HIERBA1("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla1.jpeg"),
	HIERBA10("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla10.jpeg"),
	NIEVE1("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla2.jpeg"),
	DESIERTO1("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla3.jpeg"),
	DESIERTOMERCADO("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla4.jpeg"),
	CUEVA("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla5.jpeg"),
	BOSQUESECO("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla6.jpeg"),
	BOSQUEROJISZO("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla7.jpeg"),
	CATACUMBA("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla8.jpeg"),
	CUEVACONESRTUCTURAS("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla9.jpeg");
	
	public String fondo;

	private Fondos(String fondo) {

		this.fondo = fondo;
	}

	
}