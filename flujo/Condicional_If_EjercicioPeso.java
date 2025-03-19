package one.midominio.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_EjercicioPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero=JOptionPane.showInputDialog("Eres H o M?");
		

		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Altura en cm, por favor;"));
		
		int pesoIdeal=0;
		
		
		if(genero.equals("H")) {
			
			pesoIdeal=altura-110;
			
		}
		else if(genero.equals("M"))
		{
			pesoIdeal=altura-120;
		}
		
		
		System.out.println("Tu peso ideal es " + pesoIdeal + " Kg");
		
		
		/*
		String genero=JOptionPane.showInputDialog("Eres H o M?");
				
			
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Altura en cm, por favor;"));
		int peso=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Peso en kg, por favor;"));
		
		int pesoIdealHombre=altura-110;
		int pesoIdealMujer=altura-120;
		
		
		if(genero.equals("H") && peso<=pesoIdealHombre) {
			
			JOptionPane.showMessageDialog(null, "estás dentro de tú peso ideal, que es de "+ pesoIdealHombre+ " seria  "+ peso);
			
			
			}else if(genero.equals("M") && peso<=pesoIdealMujer)
				
					{
						JOptionPane.showMessageDialog(null, "estás dentro de tú peso ideal, que es de "+ pesoIdealMujer+ " seria  "+ peso);
					}
			else
				
				JOptionPane.showMessageDialog(null, "no estás en tú peso ideal ");
		*/
	
	}

}
