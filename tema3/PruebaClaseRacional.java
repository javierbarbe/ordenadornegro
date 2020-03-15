package cocheClasePaquete;

public class PruebaClaseRacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    ClaseRacional r1 = new ClaseRacional(2,5); // crear un objeto CRacional
		    ClaseRacional r2= new ClaseRacional(2,5);
		    
		    r2.setDenominador(15);
		    System.out.println(r2.getDenominador());
		   r1.visualizarRacional();

		    r2.visualizarRacional();

		  }

	

}
