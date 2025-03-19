package one.midominio.entradasysalidas;
import java.util.Scanner;
import javax.swing.*;
import java.math.*;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	

		int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base, por favor"));
		
		int exponente=Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente, por favor"));
		
    	
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado es "+ resultado);
		
	
			
		

	}

}
