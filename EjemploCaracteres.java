package java_primeros_pasos;

public class EjemploCaracteres {
	public static void main(String[] args) {
		
		System.out.println("Uso de char \n");
		char caracter = 'a'; //Soporte numeros pero me muestra los caracteres de la tabla ascii, No soporta 2 caracteres a la vez
		System.out.println("Se imprime el caracter: "+caracter);
		
		caracter = 1;
		System.out.println("Se imprime el caracter con numeros: "+caracter);
		
		caracter = 68 + 1;
		char segundoCaracter = (char) (caracter + 1);
		System.out.println("Se imprime el caracter de un cast con char y es : "+ segundoCaracter +"\n");
		
		System.out.println("Uso de String \n");
		String palabra = "Curso de Alura ";
		System.out.println("El String escrito es:" + palabra);
		
		palabra = palabra + 2022;
		System.out.println("El String concatenado es: " + palabra);
		
		
	}

}
