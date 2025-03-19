package one.midominio.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	distancia_colegio;
		
		double renta_familiar;
		
		byte hermanos_centro;
		
		distancia_colegio=Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia del colegio en km"));
		
		renta_familiar=Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar"));
				
		hermanos_centro=Byte.parseByte(JOptionPane.showInputDialog("Introduce nº de hermanos"));
		
		if( distancia_colegio>10 || renta_familiar<20000 || hermanos_centro>=2) {
			
			 System.out.println("el alumno tiene beca");
		}
		
		else {
				 
				 System.out.println("el alumno no tiene beca");
		}


	}
	}
