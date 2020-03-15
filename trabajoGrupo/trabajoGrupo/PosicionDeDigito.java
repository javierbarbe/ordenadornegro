package trabajoGrupo;
import java.util.Scanner;
public class PosicionDeDigito {
Scanner e =new Scanner(System.in);

//atributos
  int i;// cifra;
  String num, cifra;
  
	public PosicionDeDigito() {
		System.out.println("Introduce numerito de los webs");
		num=e.next();
		System.out.println("dime el numero que buscas");
		cifra=e.next();
		//char c= (char) cifra;
		System.out.println(num.indexOf(cifra));
	}
	
}
