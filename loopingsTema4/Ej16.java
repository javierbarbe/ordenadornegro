package loopingsTema4;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// BBBBBBBB ??? porque hace 2 
							/*	******
								3 
								******
								2 
								******  */
	/*  	int i=2;
		while (i<5) {
			for (int j=i; j>1; j--) {
				System.out.println(j + " ");
				System.out.println("******");
				i++;
			}
		} */
		
	/*	AAAAAAAA 
	 * for(int a= 1; a <5; a++ ) {
			int q= 0; 
			while (q<a) {
				System.out.print(q +" ");
				q++;
			}
		}*/
		
		/*cccccccc
	  int p= 5; 
		while( p>=1) {
			
			int num=1; 
			for (int j=1; j<=p; j++) {
				System.out.print(num+ "***");
				num*=2; 
				
			} System.out.println();
			p--;
		} */
		
		//  DDDDDDD 
		      int i=1; 
		do {
		
			int numer=1;
			for ( int j= 1; j<=i; j++) {
				System.out.println(numer + "G");
				numer+=2;
			}
			System.out.println();
			i++;
		} while (i<=5);
		
	}

}
