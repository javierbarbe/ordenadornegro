package problemasU4;
import java.util.Scanner;
public class Pares {
private int sumatorio,contador; 
private long num; 
	//public Pares() {}
	
	public  Pares() {}
	public void miraPar() {
	Scanner entrada=new Scanner(System.in); 
	num=entrada.nextLong();
	while(num<0) 
		 {
	
		System.out.println("numero incorrecto, introduzca positivo");
		this.num=entrada.nextLong();}
	if(this.num>0) {
		while (this.num!=0) {
			if (this.num%2==0) {
				this.contador++;
				this.sumatorio+=this.num%10;
				 System.out.print(this.num%10+ " ");
			}this.num=this.num/10;
				
					
				
				
				/*	if(num<10 && num!=0) {
			total+=(num);
			System.out.print(num+" ");
			}else {
				total+=(num/10);
				
			}num=num%10;
		
		}System.out.print(num+" ");
		
	}*/
	
	
}System.out.println("\n"+this.contador + " numeros son Pares. \n La suma es "+this.sumatorio);
}}}
