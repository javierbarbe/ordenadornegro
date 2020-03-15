

import java.util.Scanner;

public class Capicua {
	Scanner e=new Scanner(System.in);
	
	 String num="";
	
	 String volteadoFinal="";
	
	 public Capicua() {
		
			
			System.out.println("introduce un numero");
				num=e.nextLine();
			
			for(int a=0; a< num.length();a++) {
				String volteado=Character.toString(num.charAt(num.length()-1-a));
				
					//System.out.println(volteado);
					 volteadoFinal +=(String)volteado;
			}
			
			System.out.println(volteadoFinal);
				if(volteadoFinal.equals(num)) {
			System.out.println("El numero es capicua");
				}else {
					System.out.println(num.equals(volteadoFinal)+ " es mas falso que el alma de judas Priest");
					System.out.println("No es capicua");
						}
		}
}

