package java_primeros_pasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Condicional if, else y boolean.\n");

		int edad = 22;
		int cantidadPersonas = 2;
		// System.out.println("El valor de la condicion es: " + esPareja);
		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;
		}else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;

		if (puedeEntrar) {
			System.out.println("Es mayor de 18 años puede entrar");
			System.out.println("Bienvenido");
		} else {
			System.out.println("Usted no esta permitido a " + "entrar");
		}
	}
}
