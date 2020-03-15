package problemasU4;
import java.util.Scanner;


public class LetraL {
	
	//atributos 
	private int altura;
 Scanner entrada=new Scanner(System.in);
	//public LetraL () {}

 public LetraL() {}
 
 public void dibujaLetra2(int b) {
	 System.out.println("Altura para la letra");
	
	 for(int alt=1;alt<=b-1;alt++) 
	 	{
		 System.out.println("*");
	 	}
	 for (int longi=1;longi<=(b/2)+1;longi++) {
		 System.out.print("* ");}
	 }
 public void dibujaLetra() {
	 System.out.println("Altura para la letra");
	 altura=entrada.nextInt();
	 for(int alt=1;alt<=altura-1;alt++) 
	 	{
		 System.out.println("*");
	 	}
	 for (int longi=1;longi<=(altura/2)+1;longi++) {
		 System.out.print("* ");}
	 System.out.println();
	 }
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
 }
  
	
	

