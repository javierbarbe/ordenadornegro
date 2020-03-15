package cocheClasePaquete;

public class PruebaIndividuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individuo p1= new Individuo("9069554","joselu", 27); 
		System.out.println(p1.getEdad()+p1.getNombre()+p1.getDni());
		Individuo p2= new Individuo();
		Individuo p3= new Individuo();
		Individuo p4=new Individuo();
		System.out.println(p2.getNombre()+p2.getEdad());
		p1.setDni("0477785-E");
		System.out.println(p2.getEdad());
		
		
		
		System.out.println(Individuo.getPoblacion());
		
		
		
		
		
		
	}

}
