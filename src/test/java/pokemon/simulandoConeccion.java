package pokemon;

public class simulandoConeccion implements AutoCloseable{

	public simulandoConeccion() throws conectionException {
		primero();
	}
	
	public void conectar() throws conectionException {
		System.out.print("conectando");
		 throw new conectionException();
		
	}
	public void leerDatos() {
		System.out.print("leyendo datos");
	}
	public void cerrarConeccion() {
		System.out.print("cerrando coneccion");
	}
	
	
	public void primero() throws conectionException {
		System.out.print("primero");
		segundo();
		
	}
	public void segundo() throws conectionException {
		System.out.print("segundo");
		tercero();
		leerDatos();
	}
	public void tercero() throws conectionException {
		conectar();
		
	
		System.out.print("tercero");
	}
	
	@Override
	public void close() throws Exception {
		cerrarConeccion();
		
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		try(simulandoConeccion con = new simulandoConeccion()){
			
		}catch(conectionException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
}
