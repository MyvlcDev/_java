package one.midominio.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Edad, por favor"));
		
		if(edad<18) {
			
			System.out.println("Eres muy joven");
								
		}else if(edad<40){
			
			System.out.println(" Eres joven");
			
		
		}else if(edad<65) {
			
			System.out.println(" Eres maduro");
			
			
		}else {
			
			System.out.println("Cu�date!");
			
		}
				
		
			
	}

}
