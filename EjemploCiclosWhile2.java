package java_primeros_pasos;

public class EjemploCiclosWhile2 {
	public static void main(String[] args) {
		System.out.println("Ejemplos de Scope ciclos");
		System.out.println("* Uso de While");
		int contador = 0;
		int total = 0;
		System.out.println("Suma de todos los numeros hasta el 10");
		while (contador <= 10) {
			//int total = 0; si total se deja dentro del no se imprimira nada en println error
			total += contador; 
			contador++;
		}
		System.out.println(total);
	}
}
