package problemasU4;
import java.util.Scanner;
public class BaseExponente {
	double base;
	int exponente;
public BaseExponente(){}

public void calculaBaseExponente(){
	
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("introduce dos numeros, primero base y luego exponente");
	this.base=entrada.nextDouble();
	this.exponente=entrada.nextInt();
	System.out.println(" La potencia es " + Math.pow(this.base, this.exponente));
	
	
}	

}
