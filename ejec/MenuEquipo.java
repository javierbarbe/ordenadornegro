
import java.util.Scanner;
public class MenuEquipo {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		// TODO Auto-generated method stub
		do{
		System.out.println("\t-------MENU------\n1 Voltea numero\t        2 Es Capicua\n3 Posicion Digito\t4 Ocurrencia Digito\n5 Binario\t\t6 Salir");
		System.out.println("Introduce opcion que quieras hacer");
		int opc= e.nextInt();
		switch (opc) {
		
		case 5: BinarioDecimal culo= new BinarioDecimal();
				break;
		case 3: DigitoN digi= new DigitoN();
				break;
		case 2: Capicua cap= new Capicua();
				break;
		case 1: Voltea vol= new Voltea();
				break;
		case 4: PosicionDeDigito ps= new PosicionDeDigito();
				break;
		case 6: System.out.println("Fin de programa");
				break;
		default: System.out.println("Opcion incorrecta")
		}
		
	    }	while(opc<6 || opc>6 && opc >0);	
	}

}
