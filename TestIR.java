package java_primeros_pasos;

public class TestIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		System.out.println("Salario a comparar es:" + salario);
		if (salario >= 1900.0 && salario <= 2800) {
			System.out.println("El IR es de 7.5% \nPuede deducir de la declaración el monto de 142.");
		}else if(salario >= 2800.0 && salario <= 3751.01) {
			System.out.println("El IR es del 15% \nPuede deducir 350.");
		} else if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("El IR es 22.5% \nPuede deducir 636.");
		}
	}

}
