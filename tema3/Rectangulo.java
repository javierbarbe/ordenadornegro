package cocheClasePaquete;

public class Rectangulo {

	//atributos
	int base, perimetro, altura;
	double area;
	//constructor 
	public Rectangulo() {
		
	}
	
	//constructor copia 
	public Rectangulo(Rectangulo r) {
		this.altura=r.altura;
		this.base=r.base;
		
	}
	public Rectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;	
	}

	public double getArea() {
		area=base*altura;
		return area;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
public int getPerimetro() {
	perimetro=(base+altura)*2;
	return perimetro;
}

}
