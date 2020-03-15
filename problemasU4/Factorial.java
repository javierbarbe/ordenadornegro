package problemasU4;
import java.util.Scanner;
public class Factorial {
	private long num,numero, factorial=1;
	
	
	public Factorial() 
	{}
	
	public void buscaFactorial() {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un n para hacer el factorial");
		this.numero=entrada.nextLong();
		this.num=this.numero;
		if (this.numero==0){
			System.out.println("factorial = 1");
		} else 	{ 
			while(this.numero !=0) 
			{
				this.factorial*=this.numero;
				this.numero--;
			} System.out.println(num+ "! = "+this.factorial);
				}
	}
	
	public void Factoria() {
	this.numero=7;
	}

	public long getNumero() {
		return numero;
	}

	public long getFactorial() {
		return factorial;
	}

	
}
