package java_primeros_pasos;

public class TipoVariable {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		
		System.out.println("* Uso de variable int para enteros");
		int edad = 28;
		System.out.println(edad);
		
		edad = 65 - 20 ;
		System.out.println("Mi edad es: " +edad);
		
		System.out.println("* Uso de variable double para decimales");
		double salario = 1203.56;
		System.out.println("Salario: "+salario);
		
		double personas = 55;
		System.out.println("Numero de Personas: "+personas);
		
		double salarioMitad = salario/2;
		System.out.println("Resustado de dividir salario entre 2:"+salarioMitad);
		
		System.out.println("* Converiones");
		
		double variable1 = 230.98;
		System.out.println("Numero double es:"+ variable1);
		System.out.println("Convercion de numero double a int usando un cast");
		int variableEntero = (int) variable1; //cast 
		System.out.println("Convercion a int es:"+ variableEntero);
		
		}
}
