package programacionNoviembre;

import java.util.Scanner;

public class FuncionesMatematicas {
 int digitos=0,contador=0;
	

public FuncionesMatematicas() {}

public void  esPrimo (int a) {
		for(int b=1;b<=a;b++) {
			if(a%b==0) {
				
				contador++;
			}
		} if(contador<=2) {
			System.out.println("el numero " +a + " es primo");
			
		}else {
			System.out.println("no es un numero primo "+a);
		}
	//return decision;}
	}


public void cuentaDigitos(int d) {
	
	while(d!=0) {
		d/=10; //d=d/10
		digitos++;
	}
	System.out.println("cantidad de digitos= "+digitos);
	
}
}
