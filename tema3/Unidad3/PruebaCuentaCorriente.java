package programacionNoviembre;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CuentaCorriente c1 = new CuentaCorriente();
System.out.println(c1.numCuenta);
CuentaCorriente c2= new CuentaCorriente(4000);
System.out.println(c2.numCuenta);
System.out.println(c2.saldo);
System.out.println(c1.saldo);
	}

}
