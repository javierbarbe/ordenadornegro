package problemasU4;
import java.util.Scanner;
public class Primos {

	//atributos
	private double n, contador;
	
	
	public Primos() {}
	public void pruebaPrimos() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca el numero que quiera comprobar si es primo");
		n=entrada.nextDouble();
		for (int i=1; i<=this.n; i++)
		{
			if(this.n%i==0) {
				this.contador++;
						}
		}
		if (this.contador<=2)
		{
			System.out.println("el numero " + this.n+ " es primo");
		} else {
					System.out.println(this.n+" No es primo");
				}
	}
	
	
}
