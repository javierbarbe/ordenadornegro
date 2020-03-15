package loopingsTema4;

import java.util.Scanner;

public class Ej7whileToDoWhile {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int sum=5;
		System.out.println("Introduzca un entero "+ "(el programa acaba si el numero es 0)");
		int num=entrada.nextInt();
		do {
			sum+=num; 
			System.out.println("introduce entero " + "(el programa acaba si es 0)" );
			num=entrada.nextInt();
		}while(num!=0);

	}

}
