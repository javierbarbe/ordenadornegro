package loopingsTema4;

public class Ej3 {
	public static void main(String [] args) {
	int i=1; 
	while(i<10) 
	{
		if(i%2==0) {
		System.out.println(i);
		
		}
		i++;
	}
	
	int b=10;
	while(b<20) {
		if(b%2==0) {
			System.out.println(b++);
		}
		b++;
	} 
	
	int c=20;
	while (c<30) {
		if ((c++)%2==0) {
			System.out.println(c);
		}
	}
}
}

