package one.midominio.entradasysalidas;

import java.util.Scanner;

import javax.swing.*;

public class CalculoPotenciaJOptionPane2Lineas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		Scanner entrada1 = new Scanner(System.in);

		System.out.println("Introduce la base de la potencia");
		
		int base=entrada1.nextInt();

		System.out.println("Introduce la base de la exponente");
		
		int exponente=entrada1.nextInt();
	*/
	 
		/*
		int base =Integer.parseInt(JOptionPane.showInputDialog("Introduce la bese"),Integer.parseInt(JOptionPane.showInputDialog("Introduce la exponente")));
	
		int exponente =Integer.parseInt(JOptionPane.showInputDialog("Introduce la exponente"));
		
		double resultado=Math.pow(base, exponente);
		
		
		*/
		
		double resultado= Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Introduce la bese")), Integer.parseInt(JOptionPane.showInputDialog("Introduce la exponente")));
		
		
		System.out.println("El resultado de  " + resultado);
	
	
	}

}
