package ar.com.codoacodo.pokemon.base;

public class UsuarioBuilder {

	private String nombre;
	private String username;
	private int edad;
	private String password;
	private static UsuarioBuilder usuarioBuilder = new UsuarioBuilder();

	UsuarioBuilder() {

		//this.usuarioBuilder = new UsuarioBuilder();
	}

	public Usuario build() {
		Usuario usuario = new Usuario(usuarioBuilder);
		return usuario;
	}

	

	public UsuarioBuilder nombre(String nombre) {
		this.usuarioBuilder.nombre = nombre;
		return this;
	}

	

	public UsuarioBuilder username(String username) {
		this.usuarioBuilder.username = username;
		return this;
	}

	public UsuarioBuilder password(String password) {
		this.usuarioBuilder.password = password;
		return this;
	}

	public UsuarioBuilder edad(int edad) {
		this.usuarioBuilder.edad = edad;
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUsername() {
		return username;
	}

	public int getEdad() {
		return edad;
	}

	public String getPassword() {
		return password;
	}

	public static UsuarioBuilder getUsuarioBuilder() {
		return usuarioBuilder;
	}

	@Override
	public String toString() {
		return "UsuarioBuilder [nombre=" + nombre + ", username=" + username + ", edad=" + edad + ", password="
				+ password + ", build()=" + build() + ", getNombre()=" + getNombre() + ", getUsername()="
				+ getUsername() + ", getEdad()=" + getEdad() + ", getPassword()=" + getPassword() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
