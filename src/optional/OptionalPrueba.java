package optional;

import java.util.Optional;

public class OptionalPrueba {

	public static void main(String[] args) {
//		probarOptional(null);
//		orElseOptional(null);
//		orElseThrow(null);
		isPresent(null);
	}
	
	public static void probarOptional(String nombre) {
		System.out.println(nombre.length());
	}
	
	public static void crearOptional() {
		Optional<String> optional = Optional.empty();
		optional.get();
	}
	
	public static void orElseOptional(String nombre) {
		Optional<String> optional = Optional.ofNullable(nombre);
//		Optional<String> optional1 = Optional.of(nombre);
		
		String nombreOffNullable = optional.orElse("Valor por defecto");
		
//		String nombreOff = optional1.orElse("Valor por defector1");
		
		System.out.println(nombreOffNullable);
//		System.out.println(nombreOff);
	}
	
	public static void orElseThrow(String nombre) {
		Optional<String> optional = Optional.ofNullable(nombre);
		optional.orElseThrow(NullPointerException::new);
		String nombre1 = optional.get();
		System.out.println(nombre1);
	}
	
	public static void isPresent(String nombre) {
		Optional<String> optional = Optional.ofNullable(nombre);
		System.out.println(optional.isPresent());
	}
	
}
