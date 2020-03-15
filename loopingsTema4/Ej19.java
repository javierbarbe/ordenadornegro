package loopingsTema4;

public class Ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1; i<4; i++) {
			for (int j=1; j<4; j++) {
			System.out.println(i+ " i");
			System.out.println(j+ " j");// porque no devuelve 
									// i= 2 j= 3??
				if (i*j>2) 
					break;
				System.out.println(i*j+ "multiplicacion");
			}
			System.out.println(i);
		}		
	}

}
