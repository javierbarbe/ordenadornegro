package cocheClasePaquete;

public class ClaseRacional {
	
	
						//atributos
	 private int numerador;

	  private int denominador;

	 public ClaseRacional() {} // construtor por defecto

	 public  ClaseRacional(int numerador, int denominador)

	  {
	    this.numerador = numerador;
	    this.denominador = denominador;
	  }

	 //  if (denominador == 0) denominador = 1; // el denominador no puede ser cero

	 public  void visualizarRacional()

	  {
		 System.out.println(numerador + "/" + denominador);

	  }

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	 
}
	
	


