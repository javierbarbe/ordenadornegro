package ejerciciosLibro200;

public class PruebaBandera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BanderaEspaņa nueva=new BanderaEspaņa();
nueva.calculaPrecio();
nueva.enviar();
 
 //System.out.println( nueva.getEstado());
 
System.out.println(BanderaEspaņa.getTotalEnviadas()+ " Banderas enviadas");
BanderaEspaņa dos=new BanderaEspaņa();
dos.calculaPrecio();
dos.enviar();
System.out.println(BanderaEspaņa.getTotalEnviadas()+ " banderas enviadas");
BanderaEspaņa copiada= new BanderaEspaņa();

copiada.constructorCopia(dos);
System.out.println("alto copiado: "+ copiada.getAlto()+ " ancho copiado: "+ copiada.getAncho()+ " precio "+copiada.getPrecioTotal()+ copiada.getEscudo());
 /* dos.enviar();
 dos.enviar();*/
// System.out.println(dos.getEstado());
 //+nueva.getEstado());
	}

}
