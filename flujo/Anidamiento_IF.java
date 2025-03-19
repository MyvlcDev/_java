package one.midominio.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Edad, por favor;"));
		
		if(edad>=18) {
				
					String carnet= JOptionPane.showInputDialog("¿Tienes carnet?: ");
				
					if(carnet.equals("si")) {
						
						JOptionPane.showMessageDialog(null, "Puedes comprar el cohce ");
					}
					else {
						JOptionPane.showMessageDialog( null,"Sin carnet no hay coche: ");
						
						}
					
					}
					else {			
					
					JOptionPane.showMessageDialog(null, "Si eres menor de no puedes terner carnet y por lo tanto tampoco cohe ");
			
							
		}
			
		
	}

}
