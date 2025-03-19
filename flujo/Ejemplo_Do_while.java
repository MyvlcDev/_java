package one.midominio.flujo;
import javax.swing.JOptionPane;

public class Ejemplo_Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane.showMessageDialog(null,"Este programa cuenta los caracteres de la frase o palabra introducidad \n"+ "Para terminar escriba salir"  );
		
		
		String texto;
		
		do {
			texto=JOptionPane.showInputDialog("Introduce el Texto");
			
			JOptionPane.showMessageDialog(null,"El texto introducido tiene " + texto.length() + " caracteres" );
			
			
		}while(!texto.equals("salir"));
		
		System.out.println("Has salido del programa");
	}

}
