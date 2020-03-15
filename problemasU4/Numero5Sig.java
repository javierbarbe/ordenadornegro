package problemasU4;
import java.util.Scanner;
public class Numero5Sig {
	private int u=1,contador,contador2;
	private long b,nume;
	
	public Numero5Sig() {}
	public void cuentaSig() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduce numero positivo y veremos sus cinco siguientes");
		this.nume=entrada.nextLong();
		
		while (this.nume<0) {
			System.out.println("Numero positivo par favar");
			this.nume=entrada.nextLong();}
		
		for ( int i=1; i<=this.nume; i++) {
			
			if(this.nume%i==0) {
				contador++;
			}}
			if (contador<=2) {
				System.out.println("El numero "+nume+ " es primo");
				}else {
				System.out.println("El numero "+nume+" no es primo");
				}
			
				
		for(long numerosiguiente=nume+1; numerosiguiente<=nume+5;numerosiguiente++)
		{
			for (int u=1; u<=numerosiguiente;u++) {
			if(numerosiguiente%u==0)	{
				contador2++;
			}
			
			
			
			}if(contador2<=2) {
				System.out.println(numerosiguiente+" es primo");
			}else {
				System.out.println(numerosiguiente+" no es primo");
				  }contador2=0; // la PUTA CLAVEEEEEEEEEEEEEEEEEEEEEEEEE
		}
		}
	}

			
			//System.out.println(b);
				/*	 for (int t=1;t<=this.b;t++) 
					{
						if(this.b%t==0)
						{
							contador2++;
						}}
					
						if (contador2<=2) 
						{
							System.out.println("El numero "+b+ " es primo");
						}
					}
						if(contador2>2) {
							System.out.println("el numero "+b+" no es primo");
						}*/
					 
					
		
		
			
		
	