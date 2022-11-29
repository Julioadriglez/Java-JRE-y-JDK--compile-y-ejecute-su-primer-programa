package java_primeros_pasos;

public class EjercicioTablaMultiplicacion {
	public static void main(String[] args) {
		
		System.out.println("Ciclos for anidados o anexados");
		
		for(int contador = 0; contador <= 10; contador++) {
			for(int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				System.out.println(contador+ " X "+multiplicacion+" = "+ contador * multiplicacion);
			}
			System.out.println("\n");
		}
	}
}
