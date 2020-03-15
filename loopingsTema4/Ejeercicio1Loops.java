package loopingsTema4;
import java.util.Scanner;
public class Ejeercicio1Loops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
int num1;
System.out.println("Introduzca numero");
num1=entrada.nextInt();

if (num1%20==0) {
	System.out.printf("el numero %d es divisible por 4 y 5%n", num1);
				
		}else if (num1%4==0 || num1%5==0) {
			
		
		if(num1%4==0) {
				System.out.println("el num "+num1+" es divisible por cuatro");
			}   if (num1%5==0){
				System.out.println("el nUm "+num1+ " es divisible por 5");
			}}
				
		 if(num1%4==0 ^ num1%5==0) {
			if (num1%4==0) {
			System.out.println("El numero solo es divisible por 4 ");
			}else {
				System.out.println("el numero solo es divisible por cinco");
			}
		}

	}

}
