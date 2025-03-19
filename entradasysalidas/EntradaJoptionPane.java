package one.midominio.entradasysalidas;

import javax.swing.JOptionPane;

public class EntradaJoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		System.out.println("Tu nombre es "+ nombre + "tu edad es " + edad);

	}

}
