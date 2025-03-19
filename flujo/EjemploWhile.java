package one.midominio.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Vicente";
		
		String acceso="";
		
		while (!clave.equals(acceso)) {
			
			acceso=JOptionPane.showInputDialog("Introduce la clave de acceso, por favor");
					
					if(!clave.contentEquals(acceso)) {
						System.out.println("La clave es incorrecta");
					}
			
		}
		
		System.out.println("Bienvenido a zona de usuarios");
		
		
		
		
		
	}

}
