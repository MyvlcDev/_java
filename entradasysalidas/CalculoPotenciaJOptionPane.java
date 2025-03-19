package one.midominio.entradasysalidas;


import javax.swing.*;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		Scanner entrada1 = new Scanner(System.in);

		System.out.println("Introduce la base de la potencia");
		
		int base=entrada1.nextInt();

		System.out.println("Introduce la base de la exponente");
		
		int exponente=entrada1.nextInt();
	*/
	
		int base =Integer.parseInt(JOptionPane.showInputDialog("Introduce la bese"));
	
		int exponente =Integer.parseInt(JOptionPane.showInputDialog("Introduce la exponente"));
		
		double resultado=Math.pow(base, exponente);
		
		System.out.println("El resultado de  "+ base + " elevado a " + exponente + " es " + resultado);
	
	
	}

}
