package trabajoGrupo;
import java.util.Scanner;
public class VolteaNumeros {
	

		Scanner e=new Scanner(System.in);
		
		 String num="";
		
		 String volteadoFinal="";
			
			
			public VolteaNumeros() {
				System.out.println("introduce un numero");
				num=e.nextLine();
			
			for(int a=0; a< num.length();a++) {
				String volteado=Character.toString(num.charAt(num.length()-1-a));
				
			System.out.println(volteado);
			 volteadoFinal +=(String)volteado;
			
			
			} System.out.println(volteadoFinal);
			if(volteadoFinal.equals(num)) {
			System.out.println("El numero es capicua");
		}else {
			System.out.println(num.equals(volteadoFinal)+ " es mas falso que el alma de judas Priest");
				}
		}
		
			public void binarioDecimal() {
				
				// de un entero devuelveme la posicion en la que esta un numero introducido por teclado
				//si no esta, me dices -1 (indexOf)
				
				System.out.println("Introduce un numero entero");
				int entero;
				entero=e.nextInt();
			
				        String binario = " ";// para almacenar los restos
				        if (entero > 0) { //NUMERO INGRESADO ES MAYOR A CERO
				            while (entero > 0) {
				                if (entero % 2 == 0) {//12 es multiplo de dos?...
				                    binario = "0" + binario; // si va cero
				                } else {
				                    binario = "1" + binario;
				                }
				                entero = entero / 2;//lo divido por dos
				            }
				        } else if (entero == 0) {
				            binario = "0";
				        } else {//NUMERO INGRESADO MENOR A CERO
				            binario = "No se pudo convertir el numero. Ingrese solo números positivos";
				        }
				        System.out.println("El número convertido a binario es: " + binario);
				    }

	
}
