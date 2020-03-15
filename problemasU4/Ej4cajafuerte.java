package problemasU4;
import java.util.Scanner;
public class Ej4cajafuerte {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//int a,b,c,d;
		int intentos=0,cifra;
		
		CajaFuerte caja= new CajaFuerte();


System.out.print(caja.getDigito1());
System.out.print(caja.getDigito2());
System.out.print(caja.getDigito3());
System.out.println(caja.getDigito4());
while(intentos<4) {
	caja.introduceNumeros();
	cifra=entrada.nextInt();

if(cifra<=9999) {
caja.numero4Digitos(cifra);	
}
else {
System.out.println("Numero no valido, solo 4 cifras");

}
	/*a=entrada.nextInt();
	b=entrada.nextInt();
	c=entrada.nextInt();
	d=entrada.nextInt();*/
if((caja.getNumero()==caja.getDigito1())&&(caja.getNumero2()==caja.getDigito2())&& (caja.getNumero3()==caja.getDigito3()) && (caja.getNumero4()==caja.getDigito4())){
//if(a==caja.getDigito1() && b==caja.getDigito2() && c==caja.getDigito3() && d==caja.getDigito4()) {
	System.out.println("Enhorabuena, has abierto la caja de Pandora");
	break;
}else {
	System.out.println("Has fallado");
	intentos++;
}} if (intentos==4) {
System.out.println("Intentos agotados");}


									
	}

}
