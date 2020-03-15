package problemasU4;
import java.util.Scanner;
public class Suma {

	double numer,total;
	int n, contador; 
	
	//100 000
public Suma() 
	{
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("Introduce numeros");
	
	while (this.total<100000) 
	{
		this.numer=entrada.nextDouble();
		this.contador++;
		this.total+=numer;
	}
	 System.out.println(this.total+ " Cantidad total");
	 System.out.println(this.contador+ " Cantidad de  numeros sumados");
	 System.out.println(Math.round(this.total/this.contador) + " Media");
	
	
	
	}



}

