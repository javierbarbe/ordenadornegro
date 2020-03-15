package problemasU4;
import java.util.Scanner;
public class PositivosN {
private double num, negativos,positivos;
private int total=0;
	public PositivosN() 
	{}
	public void cuentaPositivos() {
	 Scanner entrada=new Scanner(System.in);
	while (total<10) 
		{
			System.out.println("Introduce un numero");
			this.num=entrada.nextDouble();
		if(this.num<0) {
			this.negativos++;
				} else {
			this.positivos++;
						} total++;
		} 
	System.out.println("Son positivos " + this.positivos + " . Son negativos "+ this.negativos);
	}

}