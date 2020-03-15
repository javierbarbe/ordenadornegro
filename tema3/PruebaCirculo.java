package cocheClasePaquete;

public class PruebaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circulo c1=new Circulo();

c1.setRadio(10);
System.out.printf("Area de circulo c1=%.2f de radio %d%n",c1.area(), c1.getRadio() );


Circulo c2 =new Circulo();
System.out.printf("Radio de circulo c2=%d%n", c2.getRadio());

System.out.printf("Area circulo c2= %.2f ",c2.area());
	}

}
