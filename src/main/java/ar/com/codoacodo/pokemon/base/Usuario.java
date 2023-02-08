package ar.com.codoacodo.pokemon.base;

public class Usuario {

	private String nombre;
	private String username;
	private int edad;
	private String password;

	Usuario(UsuarioBuilder builder) {
		this.nombre = builder.getNombre();
		this.username = builder.getUsername();
		this.edad = builder.getEdad();
		this.password = builder.getPassword();
	}

	public synchronized static UsuarioBuilder builder() {
		return new UsuarioBuilder();
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", username=" + username + ", edad=" + edad + ", password=" + password
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
