package cocheClasePaquete;

public class Individuo {
	
	private String dni;
	private String nombre= "joseluis" ;
	private int edad; 
	public static double poblacion=0;
	//dni ,nombre año nascimento
	 
	public Individuo() {
		poblacion++;
	}
	
	public Individuo (String dni, String nombre, int edad) {
	
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
		poblacion++;
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static double getPoblacion() {
		return poblacion;
	}

	public static void setPoblacion(double poblacion) {
		Individuo.poblacion = poblacion;
	}
	
	
	
	
	
	
	

}
