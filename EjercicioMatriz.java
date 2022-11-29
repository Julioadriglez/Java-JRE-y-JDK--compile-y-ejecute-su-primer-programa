package java_primeros_pasos;

public class EjercicioMatriz {
	public static void main(String[] args) {
		System.out.println("Creacion de una matriz de asteriscos con for");
		for(int fila = 0; fila <= 10; fila++) {
			for(int columna = 0;columna < fila ; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
