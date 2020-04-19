package referencia;

public class User {
	private String nombre;
	
	public User(String nombre) {
		this.nombre = nombre;
	}
	
	public static void referenciaAMetodoEstatico() {
		System.out.println("Probando referenca a Metodo Estatico");
	}
	
	public void referenciaAMetodoParticular() {
		System.out.println("Probando referenca a Metodo de Objeto Particular");
	}
	
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	
}
