package one.midominio.flujo;

import javax.swing.JOptionPane;

public class Ejercicio1_For {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		
		
		int arroba=0;
		int punto=0;
		
		boolean testArroba=false;
		boolean testPunto=false;
		
		boolean valido=false;
		
		
		do {

				String email=JOptionPane.showInputDialog("Introduzca una dirección de Email");
				int recorrido=email.length();
				
				System.out.println(email);
				
						
				
					
						for(int i=0;i<recorrido;i++)
						{
							
							//subemail=email.substring(i);
						
								if(email.charAt(i)=='@') {
									
									arroba++;
									if(arroba<=1)
									testArroba=true;
														
								} 													
									
								if(email.charAt(i)=='.') {
									
									punto++;
									if(punto<=1)
									testPunto=true;}
									
						}
										
								
						if(testArroba==true && testPunto==true && recorrido>=4)
						{
							System.out.println("la cadena introducida es valida");
							valido=true;
							
						}else System.out.println("la cadena introducida no es valida");
	
		
		
			}while(valido==false);
		
		
		

	}

}
