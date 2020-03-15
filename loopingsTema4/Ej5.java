package loopingsTema4;
import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num, max;
		num=entrada.nextInt();
		max=num;
		while (num!=0) {
			System.out.println("introduzca el segundo numero");
			num=entrada.nextInt();
			if (num>max) {
				max=num;
			}
			System.out.println("max es "+ max);
			System.out.println("num " + num);
		}
	}

}
