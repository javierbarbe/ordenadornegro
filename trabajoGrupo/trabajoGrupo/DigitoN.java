package trabajoGrupo;
import java.util.Scanner;
public class DigitoN {
public DigitoN() {
	int numerito, posicion;
	String numerit;
	Scanner e = new Scanner(System.in);
	System.out.println("Introduce un numero");
	numerito= e.nextInt();
	System.out.println("Qué posicion quieres consultar?");
	posicion=e.nextInt();
	numerit= Integer.toString(numerito);
	System.out.println(numerit.charAt(posicion));
}
}
