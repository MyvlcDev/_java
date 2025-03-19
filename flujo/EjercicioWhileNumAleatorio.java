package one.midominio.flujo;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class EjercicioWhileNumAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Random rand=new Random();
		int numIntro;
		
		int numAleatorio = rand.nextInt(100);
		System.out.println(numAleatorio);
		
		
		Scanner entradaEscaner = new Scanner (System.in);
		
		System.out.println("introduzca un numero entre 0 y 100");
		
		do {
			
			numIntro= Integer.parseInt(entradaEscaner.nextLine ());

			
			System.out.println ("Entrada recibida por teclado es: " + numIntro );
			
			
			if(numIntro>numAleatorio)
			{
				System.out.println("El número Aleatroio es menor\n");
			}else if(numIntro<numAleatorio)
				{
					System.out.println("El número Aleatroio es mayor \n" );
				}else
				{
					System.out.println("correcto");
				}
				
		}while(numAleatorio!= numIntro);
		
		
	}

}
