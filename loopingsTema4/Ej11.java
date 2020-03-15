package loopingsTema4;

public class Ej11 {

public static void main(String[] args) {
	
	int i=0;
	long sum=0;
		// quitar do y pegar la expresion while en su lugar para que sea solo while
	do {
		sum=sum+i;
		
		++i;
		
		System.out.printf("i=%d y sum es %d%n" , i, sum );
		
		System.out.println("i vale " +i);
		}while ( i<=5);
	}
}
