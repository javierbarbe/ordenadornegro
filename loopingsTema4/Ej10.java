package loopingsTema4;
import java.util.Scanner;
public class Ej10 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int number, sum=0, count;
		for (count=0; count<5; count++) {
			number=entrada.nextInt();
			sum+=number;
			System.out.printf("la suma es %d   el numero introducido es %d", sum, number); //extra para ver el comportamiento
		// realiza hasta cinco operaciones sumando 
		}
System.out.printf( "%n sum es %d, count es %d ", sum, count);
	}

}
