package cocheClasePaquete;

public class Complejo {

	double real;
	double imag;
	
		public Complejo() {
			real=0.0d;
			imag=0.0d; // d porque es un numero TIPO DOUBLE
		}
	 public Complejo(double real, double imag) {
		 this.real=real;
		 this.imag=imag;
	 }
	 
	 				// GETTERS
	 
	 public double consulta_real() {
		 return real;
	 }
	 public double consulta_imag() {
		 return imag;
	 }
	 
	 			// SETTERS
	 
	 public void cambia_real(double real) {
		 this.real=real;
	 }
	 
	 public void cambia_imag(double imag) {
		 this.imag=imag;
	 }
	 
	 public String toString() {
		 String str= real+" + "+ imag+ "i";
		 return str;
	 }
	 
	 public void sumar(Complejo b) {
		 this.real+=b.real;
		 this.imag+=b.imag;
	 }
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	 
	 
	 
	 
}
