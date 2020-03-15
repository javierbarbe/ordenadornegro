package Unidad3;

public class Pizza {
	//atributos
	//public String familiar, mediana, hawaiana, con_queso, barbacoa, jamon;
	public int sirve=0;
	public String sabor, tamaño;
	public static int  totalServidas=0,totalPedidas=0;
	public Pizza(String sabor, String tamaño) {
		this.sabor=sabor;
		this.tamaño=tamaño;
		totalPedidas++;
		
	}
	public Pizza() {
		
	}
	public  void sirve() {
		if(sirve==1) {System.out.println("Esa pizza ya se ha servido");}else {
		sirve=1;
		totalServidas++;
		System.out.println("pizza "+ sabor+ " de tamaño "+ tamaño+ " pedida");
	}}
	
	/*public int cuentaTotalServidas() {
		return totalPedidas;
	}*/
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public static int getTotalServidas() {
		return totalServidas;
	}
	/*public void setTotalServidas(int totalServidas) {
		this.totalServidas = totalServidas;
	}*/
	public static int getTotalPedidas() {
		return totalPedidas;
	}
	/*public void setTotalPedidas(int totalPedidas) {
		this.totalPedidas = totalPedidas;*/
	}


