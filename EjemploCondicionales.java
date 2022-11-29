package java_primeros_pasos;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Condicional if y else.\n");

		int edad = 17;
		int edad2 = 18;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Es mayor de 18 años puede entrar");
			System.out.println("Bienvenido");

		} else {
			if (cantidad >= 2 && edad2 >= 18) {
				System.out.println("Usted es menor de " + 
			"edad pero esta permitido su ingreso.");
				System.out.println("Bienvenido");

			}else {
				System.out.println("Usted no esta permitido a " + 
			"entrar");
			}
		}
		
	}

}
