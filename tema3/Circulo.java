package cocheClasePaquete;

public class Circulo {

	//atributos
	int radio;
	
	private double area;
	
	public Circulo() {
		radio=2;
	}
	
	public Circulo(int radio) {
		this.radio=radio;
	}
	
	public double area() {
		area=Math.pow(radio,2)*Math.PI;
		return area;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}


	
	
}
