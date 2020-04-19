package programacionFuncional;

public class Lambda implements PorDefecto{

	public static void main(String[] args) {
//		System.out.println(System.getProperty("java.runtime.version"));
		
		//Version de implementacion de java 7
		MiNombre miNombreAnonima = new MiNombre() {
			//sobreescribir un metodo
			@Override
			public String miNombre() {
				// TODO Auto-generated method stub
				return "Walter";
			}
		};
		
		System.out.println(miNombreAnonima.miNombre());
		
		//Lo mismo pero en java 8
		MiNombre miNombreLambda = () -> "Walter Abregu";
		
		System.out.println(miNombreLambda.miNombre());
		
		Sumar suma = new Sumar() {
			
			@Override
			public int suma(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		
		System.out.println(suma.suma(2, 4));
		
		Sumar suma1 = (a,b) -> a+b;
		
		System.out.println(suma1.suma(2, 8));
		
		Sumar suma2 = (a,b) -> {
			a = b*b;
			a += a + b;
			System.out.println("Mensaje dentro del Lambda");
			return a;
		};
		
		System.out.println(suma2.suma(2, 3));
		
		Lambda l = new Lambda();
		
		
		System.out.println(l.nombrePorDefecto("Walter1"));
	}

	@Override
	public void mostrarNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
