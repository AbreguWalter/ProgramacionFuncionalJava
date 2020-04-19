package referencia;

import java.util.ArrayList;
import java.util.List;

public class ReferenciaMetodo {

	public static void main(String[] args) {
		
		Trabajo trabajo = new Trabajo() {

			@Override
			public void accion() {
				User.referenciaAMetodoEstatico();
				
			}
			
		};
		
		Trabajo trabajoL = () -> User.referenciaAMetodoEstatico();
		
		Trabajo trabajoMR = User::referenciaAMetodoEstatico;
		trabajoMR.accion();
		
		/*---------------------------------------------------------------------*/
		
		User user = new User("Walter");
		
		Trabajo trabajoL2 = ()->user.referenciaAMetodoParticular();
		
		Trabajo trabajoMR2 = user::referenciaAMetodoParticular;
		
		trabajoMR2.accion();
		
		/*---------------------------------------------------------------------*/
		
		TrabajoString trabajoString = (palabra)->palabra.toUpperCase();
		
		TrabajoString trabajoStringRM = String::toUpperCase;
		
		System.out.println(trabajoStringRM.accion("walter"));
		
		
		List<User> users = new ArrayList<>();
		users.add(new User("Ashly"));
		users.add(new User("Mario"));
		users.add(new User("Wilson"));
		users.add(new User("Karen"));
		
//		users.forEach(nombre -> nombre.mostrarNombre());
		users.forEach(User::mostrarNombre);
		
		/*---------------------------------------------------------------------*/
		
		IUser user1 = new IUser() {

			@Override
			public User crear(String nombre) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		IUser user2 = (nombre -> new User(nombre));
		IUser user3 = User::new;
		
	}

}
