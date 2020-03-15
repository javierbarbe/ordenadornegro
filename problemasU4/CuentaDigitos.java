package problemasU4;
import java.util.Scanner;
public class CuentaDigitos {
private int  b,a, num,entero;
private double decimal,doub;
	//public CuentaDigitos() {}
	
	public  CuentaDigitos (int num) {
		this.num=num;
		
	}
	public  CuentaDigitos (double doub) {
		this.doub=doub;
		
	}
	
	public void contador() {
		for ( a=1; num/10!=0;a++) {
			this.num=num/10;
		}System.out.println(a);
	}
	public   CuentaDigitos() { 
		Scanner entrada=new Scanner(System.in);
		System.out.println("numero double");
		this.decimal=entrada.nextDouble();
		
		this.entero= (int)this.decimal;
		this.decimal-=this.entero;
		
		Math.round(this.decimal);
		System.out.println("parte entera "+this.entero+ "\nParte decimal "+ this.decimal);
	}
		
												
		
		
		
		
		
		
												// este metodo igual que el anterior me da unos resultados muy extraños
											// PARA UN NUMERO EJ. 6=> doub=325... no entiendo porqué
		//for ( b=1; doub/10!=0.0;b++) {
	//		this.doub=doub/10;
	//	} System.out.println(b);;
//	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getDoub() {
		return doub;
	}

	public void setDoub(double doub) {
		this.doub = doub;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
