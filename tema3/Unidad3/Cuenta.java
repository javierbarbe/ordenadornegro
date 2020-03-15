package programacionNoviembre;

public class Cuenta {

	public String num_cuenta="";
	public double saldo;
	
	
	private void generaCuenta() {
		for (int i=0;i<10;i++) {
			num_cuenta= num_cuenta+ Integer.toString((int)(Math.random()*10));
		}
		
	} public void transferencia(Cuenta c, double dinero) {
		this.saldo-=dinero;
		c.ingreso(dinero);
	}
	
	public Cuenta() {
				
	}
	
	
public Cuenta(double saldo) {
		
		generaCuenta();
		this.saldo=saldo;
	}

public void cargo(double dinero) {
	this.saldo-=dinero;
	}
public void ingreso(double dinero) {
	this.saldo+=dinero;
}


public String getNum_cuenta() {
	return num_cuenta;
}


public void setNum_cuenta(String num_cuenta) {
	this.num_cuenta = num_cuenta;
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}



}
