package loopingsTema4;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int balance =10; 
 while (true) { // mientras verdad... el que?
	 if (balance<9) // si se cumple
		 break ; 	// break se salta la resta
	 
 balance = balance-9; 
 } System.out.println("balance is "+ balance);
//imprime balance es 1
 
 int equilibrio= 10; 
 while (true) {
	 if (equilibrio<9)
		 continue;
	 equilibrio=equilibrio-9;
	 
 // da error Unreachable code si pongo 
	 //el { antes del systemprint
 System.out.println("equilibrio es "+ equilibrio);
	}
	}
} 
