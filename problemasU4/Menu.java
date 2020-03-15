package problemasU4;
import java.util.Scanner;
public class Menu {
	Scanner entrada=new Scanner(System.in);
	
	public Menu(){
		
	}
	public void dibujaMenu() {
		System.out.println("#####CALCULADORA 100TIFICA######");
		System.out.println("1. Calcula numeros primos entre dos positivos dados");
		System.out.println("2. Calcula x de la ecuacion 4x+3=0");
		System.out.println("3. Calcula el tiempo que tarda un objeto en caer\n   al suelo desde una altura h");
		System.out.println("4. Salir del programa");
	}
	public void calculaX() {
		double x;
		System.out.println("sea a=4 y b=3");
		float a=4f, b=-3f;
		x=(b/a);
		System.out.println(x);
		
	}

	
		public void   gravedad() {
			double t;
			System.out.println("Introduce altura en metros");
			double h=entrada.nextDouble();
			t=Math.sqrt(2*h/9.8);
			System.out.println( " Tarda en caer \n" +t + " segundos");
		}
	
	
	
	
	
	
	
	public void consultaPrimos() {
		Scanner entrada=new Scanner(System.in);
		int t=1,num1, num2,count=0;
		System.out.println("Introduce el primer numero entero");
		num1=entrada.nextInt();
		System.out.println("Introduce el segundo numero entero");
		num2=entrada.nextInt();
		if (num1>0 && num2>0 && num1<num2) 
		{
			for (int a=num1; a<=num2;a++) 
			{
				//System.out.println(num1);
				while (t<=a) 
				{
					if(	a%t==0) 
					{
					count++;
					}
					t++;
					}t=1;
				
					
					if (count<=2) 
					{
						System.out.println(a+ " es un numero primo ");
						
					}else{
						System.out.println(a + " no es primo");
						
					}	
				count=0;
				
			}
		
		}else {
		System.out.println("introduzca positivos parfavar");
	}
}
}

