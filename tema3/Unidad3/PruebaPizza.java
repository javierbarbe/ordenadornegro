package Unidad3;

public class PruebaPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pizza p1= new Pizza ("hawaiana", "familiar");
System.out.println(p1.tamaño);
	p1.sirve();
	
	Pizza p2= new Pizza("chocolate", "Pequeña");
	System.out.println(p2.getTamaño()+" y de sabor "+p2.getSabor());
	p1.sirve();
	p2.sirve();
	System.out.println("pizzas pedidas totales :"+ Pizza.getTotalPedidas());
	System.out.println("pizzas servidas totales :"+ Pizza.getTotalServidas());
	}

}
