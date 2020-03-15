package problemasU4;

public class CajaFuerte {

	private int numero, numero2,numero3,numero4;
	 private int digito1, digito2,digito3,digito4;
	public  CajaFuerte() {
		 digito1=  (int)Math.floor(Math.random()*10);
		 digito2= (int)Math.floor(Math.random()*10);
		 digito3= (int)Math.floor(Math.random()*10);
		 digito4= (int)Math.floor(Math.random()*10);
		/*this.digito1=digito1;
		this.digito2=digito2;
		this.digito3=digito3;
		this.digito4=digito4;*/
	
	}
	public int getDigito1() {
		return  digito1;
	}
	public void setDigito1(int digito1) {
		this.digito1 = digito1;
	}
	public int getDigito2() {
		return digito2;
	}
	public void setDigito2(double digito2) {
		this.digito2 = (int) digito2;
	}
	public int getDigito3() {
		return digito3;
	}
	public void setDigito3(int digito3) {
		this.digito3 = digito3;
	}
	public int getDigito4() {
		return digito4;
	}
	public void setDigito4(double digito4) {
		this.digito4 = (int) digito4;
	}
	public void introduceNumeros() {
		System.out.println("Introduce 4 digitos");
	}
	
	public   int numero4Digitos(int numero) {
		this.numero4=numero%10;
		this.numero3=numero/10%10;
		this.numero2=numero/100%10;
		this.numero=numero/1000%10;
		return numero+numero2 +numero3+numero4;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getNumero3() {
		return numero3;
	}
	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}
	public int getNumero4() {
		return numero4;
	}
	public void setNumero4(int numero4) {
		this.numero4 = numero4;
	}
}
