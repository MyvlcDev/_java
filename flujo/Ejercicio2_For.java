package one.midominio.flujo;

import javax.swing.JOptionPane;

public class Ejercicio2_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Enunciado del ejercicio 
		 
		  
		  En este ejercicio, se pide el cálculo del factorial de un número 
		  introducido por el usuario desde una ventana JOptionPane.
		   El factorial  de un número es igual a ese número multiplicado 
		   por todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.
		 
		    	  
		  
		 */
		
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para optener el número factorial"))   ;
		
			
		long factorial=numero;
	
		//tabla del 5
		
		for (int i=numero-1;i>0;i--){
			
			factorial=factorial*i;		
			
			

		}
		
		System.out.println("el número factoria  de "+numero+" es "+ factorial);
		
		
		
	}

}
