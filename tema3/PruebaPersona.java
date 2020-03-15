package cocheClasePaquete;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona p1= new Persona ("Perico",23, 1.98f);
		System.out.println("El nombre es "+p1.nombre +". Su edad es " + p1.edad+ " y su altura es " + p1.altura);
		p1.cambia_Edad(46);
		p1.cambia_Nombre("Rosalia");
		System.out.println(p1.edad+" "+p1.nombre);
		p1.consulta_Nombre();
		
	Persona p2= new Persona(null, 0, 0);	
	System.out.println(p2.nombre);
	System.out.println(p2.edad);
	System.out.println(p2.altura);
	}
	

}
