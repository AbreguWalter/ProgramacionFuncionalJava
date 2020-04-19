package programacionFuncional;

//Interfas funcional , especificamos que sera una interfas funcional
@FunctionalInterface
public interface Sumar {
	//Un metodo abstracto
	int suma(int a,int b);
}
//Solo se pueden hacer lambdas de una interfas funcional con un metodo unico
