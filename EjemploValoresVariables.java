package java_primeros_pasos;

public class EjemploValoresVariables {
	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println("Valor de numero2: " + numero2);
		System.out.println("Se pasa el valor de numero1 a numero2");
		
		numero2 = numero1;
		System.out.println("Valor de numero2: " + numero2 );
	
		numero1 = 99;
		System.out.println("Se asigna a numero1 el valor de;" + numero1 );
		System.out.println("Se imprime numero2 para observar que aunque el valor de numero1 cambio, numero2 no cambiara por que las variables son asignadas y no son punteros");
		System.out.println("Se asigna a numero1 el valor de " + numero2 );
		
	}
}
