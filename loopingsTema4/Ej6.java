package loopingsTema4;
import java.util.Scanner;
public class Ej6 {

	public static void main(String[] args) {
		//introduce numeros hasta que introduces el 0 condicion de dowhile
	Scanner entrada=new Scanner(System.in);
	int num, max;
	num=entrada.nextInt();
	max=num;
	do {
		num=entrada.nextInt();
		if(num>max) {
			max=num;
		}
	}while (num !=0);
		System.out.println("num es " +num);
		System.out.println("max "+max);
	
	
		
	}

}
