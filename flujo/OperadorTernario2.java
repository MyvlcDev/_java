package one.midominio.flujo;

import javax.swing.JOptionPane;


public class OperadorTernario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		double salariot1=Integer.parseInt(JOptionPane.showInputDialog("introduce el primer salario"));
		
		double salariot2=Integer.parseInt(JOptionPane.showInputDialog("introduce el primer salario"));
		
		double salario_mayor;
		
		//opción 1
		
		
		
		if(salariot1>salariot2) salario_mayor=salariot1;
		else salario_mayor=salarariot2;
		 
				
		
		//opción 2
		
		
		salario_mayor(salariot1>salariot2)?salariot1:salariot2;
		
		System.out.println("el salario mayor es:"+salarioMayor);
		
		*/
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));

		String mayor=(edad>18)?"Eres Mayor de edad":"Eres menor de edad";
		
		System.out.println(mayor);

		
		
	}

}
