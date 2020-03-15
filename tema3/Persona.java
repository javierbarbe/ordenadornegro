package cocheClasePaquete;

public class Persona {

	
	String nombre;
	int edad;
	float altura;
	String ojos;
	
	String consulta_Nombre() {
		return nombre;
	}
	void cambia_Nombre(String nom) {
		nombre=nom;
	}
	void cambia_Edad(int ed) {
		edad=ed;
	}
	void cambia_altura(float alt) {
		altura=alt;
	}
	
	public Persona(String n, int ed, float alt) {
		nombre= "maria Luisa";
		edad= 22;
		altura=1.70f;
	}
	
		public Persona(String nom, int ed, float alt, String color) {
			nombre=nom;
			edad=ed;
			altura= alt;
		}
	
}
