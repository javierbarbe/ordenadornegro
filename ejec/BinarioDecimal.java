package javiClase.ejec;


	import java.util.Scanner;

	public class BinarioDecimal {
		   private long numero, comp, digito, ndecimal;
		    private int exponente;
		     private boolean esBinario;
		
		     
		     public BinarioDecimal() {

		 Scanner e = new Scanner(System.in);
		 // atributos
	
	    

	    
	     do {
	          System.out.print("Introduce un numero binario: ");
	          numero = e.nextLong();
	          
	          esBinario = true;
	          comp = numero;
	          while (comp != 0) {
	                     digito = comp % 10; 
	                     if (digito != 0 && digito != 1) { 
	                          esBinario = false; 
	                     }
	                     comp = comp / 10; 
	           }
	      } while (!esBinario); 

	      
	      exponente = 0;
	      ndecimal = 0; 
	      while (numero != 0) {
	                
	                digito = numero % 10;
	                
	                ndecimal +=digito * (int) Math.pow(2, exponente);
	               
	                exponente++;
	               
	                numero = numero / 10;
	      }
	      System.out.println("Decimal: " + ndecimal);
	   
	
		}
}
