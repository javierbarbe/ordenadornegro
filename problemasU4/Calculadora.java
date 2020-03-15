package problemasU4;
import java.util.Scanner;
public class Calculadora {

	public static void main (String[] args) {
		Scanner entrada=new Scanner(System.in);
		Menu mn=new Menu();
		mn.dibujaMenu();
		int opciones;
		opciones=entrada.nextInt();
		
		switch (opciones) {
		
		case 1: mn.consultaPrimos();
		break;
		case 2: mn.calculaX();
		break;
		case 3:mn.gravedad();
		break;
		case 4: break;
		
		default: System.out.println("Numeros del 1 al 4 plis");
		
		}
		
	}
}
