package problemasU4;
import java.util.Scanner;
public class PintaArbol {
//atributos   
	int alturadado;
	Scanner entrada=new Scanner(System.in);
	public PintaArbol () {}
		public void dibujaArbol() {
		System.out.println("pon altura ROSALIA");
		alturadado=entrada.nextInt();
		
		for (int altura=1;altura<=alturadado;altura++) {
			
		
			for (int axt=1;axt<=altura;axt++) {
				System.out.print("* ");
		}alturadado--;
		System.out.println();}
			
		}
	
	
}














/*for(int z=1; z<=altura;z++) {
System.out.print("* ");}
System.out.println();

for (int q=1; q<=altura;q++) {
System.out.println("*");
for(int t=1; t<=altura-1; t++) {
System.out.print("* ");
}
}*/