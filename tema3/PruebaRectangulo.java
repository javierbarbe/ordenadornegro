package cocheClasePaquete;

public class PruebaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangulo r1=new Rectangulo(4,6);
System.out.println(r1.getAltura());
System.out.println(r1.getBase());
System.out.println(r1.getArea()+ "area 4-6");

Rectangulo r2=new Rectangulo();
r2.setBase(4);
r2.setAltura(7);
System.out.println(r2.getArea());

System.out.println(r2.getPerimetro());

Rectangulo r4=new Rectangulo(r1);
System.out.println(r4.getArea());
	}

}
