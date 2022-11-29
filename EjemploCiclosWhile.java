package java_primeros_pasos;

public class EjemploCiclosWhile {
	public static void main(String[] args) {
		System.out.println("Ejemplos de ciclos.");
		System.out.println("* Uso de While.");
		System.out.println("Contador de uno en uno hasta el 10.");
		int contador = 0;
		while(contador <= 10) {// Mientras que condicion
			//Ejecuta esto
			System.out.println(contador);
			//contador += 3; Suma de tres en tres
			contador ++;
		}
		
	}
}
