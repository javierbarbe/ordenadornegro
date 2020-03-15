package problemasU4;
import java.util.Scanner;
public class PruebaTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, num;
		System.out.println("introduce un numero para ver su tabla de multiplicar");
		Scanner entrada=new Scanner(System.in);
		num=entrada.nextInt();
		Tabla t1=new Tabla(num);
		t1.imprimeTablaScanner();
		t1.tablaValorNecesario(5);
		System.out.println("introduce un numero para ver su tabla de multiplicar");
		a=entrada.nextInt();
		Tabla t2=new Tabla(a);
	t2.imprimeTablaScanner();
	System.out.println("Numeros introducidos "+ t1.getNumero() +" "+t2.getNumero());
	a=entrada.nextInt();
	t2.setNumero(a);
	//System.out.println(t1.numero);
	System.out.println("ahora el 2 numero ha cambiado a "+ t2.getNumero());
	}

}
