package java_primeros_pasos;

public class DesafioFactorial {
	public static void main(String[] args) {
		int factorial = 1;
		for(int i = 0;i <= 10 ;i++) {
			if(i == 0) {
				System.out.println("El factorial de "+ i +" es: "+1);
			}else {
			factorial = factorial*i;
			System.out.println("El factorial de "+ i +" es: "+factorial);
			}
		}
	}
}
