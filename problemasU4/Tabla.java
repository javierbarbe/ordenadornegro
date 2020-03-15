package problemasU4;

public class Tabla {

	//atributos
	 private int numero;
	
	//constructor por defecto
	public Tabla () {}
	
	public Tabla (int numero) {
		
		this.numero=numero;
	}

public void imprimeTablaScanner() {
	System.out.printf("%d * 1= %d%n", this.numero, this.numero*1);
	System.out.printf("%d * 2= %d%n", this.numero, this.numero*2);
	System.out.printf("%d * 3= %d%n", this.numero, this.numero*3);
	System.out.printf("%d * 4= %d%n", this.numero, this.numero*4);
	System.out.printf("%d * 5= %d%n", this.numero, this.numero*5);
	System.out.printf("%d * 6= %d%n", this.numero, this.numero*6);
	System.out.printf("%d * 7= %d%n", this.numero, this.numero*7);
	System.out.printf("%d * 8= %d%n", this.numero, this.numero*8);
	System.out.printf("%d * 9= %d%n", this.numero, this.numero*9);
	System.out.printf("%d * 10= %d%n", this.numero, this.numero*10);
	
}
public void tablaValorNecesario(int numero) {
	System.out.printf("%d * 1= %d%n", numero, numero*1);
	System.out.printf("%d * 2= %d%n", numero, numero*2);
	System.out.printf("%d * 3= %d%n", numero, numero*3);
	System.out.printf("%d * 4= %d%n", numero, numero*4);
	System.out.printf("%d * 5= %d%n", numero, numero*5);
	System.out.printf("%d * 6= %d%n", numero, numero*6);
	System.out.printf("%d * 7= %d%n", numero, numero*7);
	System.out.printf("%d * 8= %d%n", numero, numero*8);
	System.out.printf("%d * 9= %d%n", numero, numero*9);
	System.out.printf("%d * 10= %d%n", numero, numero*10);
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}
}

