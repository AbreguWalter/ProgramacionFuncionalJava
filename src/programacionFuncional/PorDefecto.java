package programacionFuncional;


public interface PorDefecto {
	
	void mostrarNombre(String nombre);
	//A partir de java 8 puedes tener metodos por defecto.
	default String nombrePorDefecto(String nombre) {
			return nombre + "Default";
	};
}
