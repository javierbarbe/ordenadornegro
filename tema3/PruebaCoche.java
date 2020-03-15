package cocheClasePaquete;

public class PruebaCoche {
    public static void main (String [] args){
        
        
    Coche c1= new Coche ("Saab", "93",100);
    Coche c2= new Coche ("Toyota", "Corolla", 30);
    System.out.println(c1.marca+ " "+ c1.modelo + " "+ c1.kilometrajeTotal+" kilometers");
    System.out.println(c2.marca+ " "+ c2.modelo + " "+ c2.kilometrajeTotal+" km");
    
    c1.modelo="97";
    c1.marca="Renault";
    System.out.println(c1.marca+"  "+c1.modelo);
    c1.recorre(10);
    c2.recorre(35);
    System.out.println(c1.devuelveKM()+" " + c2.devuelveKM()); 
    }
}
