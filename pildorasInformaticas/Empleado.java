package pildorasInformaticas;
import java.util.*;

public class Empleado {
	
	//atributos 
	private StringBuilder nombre;
	private double sueldo;
	private Date fecha_alta;
	
	
	public void subirSueldo(double salarioExtra) {
		sueldo+=salarioExtra;
	}
	
	public StringBuilder getNombre() {
		return nombre;
	}
	public void setNombre(StringBuilder nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Date getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(int dia, int mes, int agno) {
		GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia);
		fecha_alta=calendario.getTime();
		
	}
	

}
