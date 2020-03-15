import java.util.Scanner;
public class Voltea {

Scanner entrada=new Scanner(System.in);
		int num;
		String num2="";
		int numeroInvertido;
		public Voltea() {
		
			System.out.println("escribe un numero");
			num=entrada.nextInt();
			while(num>0) {
				num2=num2+num%10;
				//System.out.println(num2);
				num=num/10;
				
				//num2=(num%10);
			}
				
				//numeroInvertido=(num/10)+(num%10);
				System.out.println(num2);
		}
    
    }
