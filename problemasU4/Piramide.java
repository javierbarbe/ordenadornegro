package problemasU4;
import java.util.Scanner;
public class Piramide {
int altura, espacios, alturadada;
char caracter;
	public Piramide() 
	{}
	public void pintaPiramide() {
	Scanner entrada= new Scanner(System.in);
		
		
		System.out.println("Introduzca altura");
		alturadada=entrada.nextInt();
		
		System.out.println("Introduzca  el tipo de caracter");
		caracter = entrada.next().charAt(0);
		
		
		//System.out.println();
       for(int altura = 1; altura<=alturadada; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=alturadada-altura; blancos++){
                System.out.print("-");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print(caracter);
            }
            System.out.println();
        }
	}
		
		/*while(altura<alturadada) {
			
			for ( int espacios=1; espacios<=alturadada-altura;espacios++)
			{
			System.out.println(" ");
			}
		for (int caract=1; caract<=(altura*2)-1; caract++) 
		{
			System.out.print(caracter);
		}
		altura++;
		}*/

		
	}
	
	
	


