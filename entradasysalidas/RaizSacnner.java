package one.midominio.entradasysalidas;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.math.*;


public class RaizSacnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Introduce un número:");
		
		int numero1=entrada.nextInt();
		
		double resultado=Math.sqrt(numero1);
		
		System.out.println("La raiz cuadrada de "+numero1+" es "+resultado);
	}

}
