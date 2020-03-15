package cocheClasePaquete;

public class Coche {
	    //atributos
	     String marca;
	     String modelo;
	    
	    int kilometrajeTotal=0;
	   
	    
	    //constructor por defecto. lo suelen tener las clases para poder inicializarse
	    public Coche(){
	    
	    }
	     // constructor
	    public Coche(String ma, String mo,int kmT){
	     marca=ma; 
	     modelo=mo;
	     kilometrajeTotal=kmT;
	    }
 
public void recorre(int km) { //void hace que no devuelva nada
	kilometrajeTotal += km;
		}

public int devuelveKM() {
	return kilometrajeTotal;
}


	}


