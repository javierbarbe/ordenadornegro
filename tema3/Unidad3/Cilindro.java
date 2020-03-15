package programacionNoviembre;

public class Cilindro {
	public static double h,r,volumen;
	public Cilindro() {}
	public static double VolumenCilindro(double h, double r) {
		volumen=h*Math.PI*Math.pow(r, 2);
		return volumen;
	}
	public static double getH() {
		return h;
	}
	public static void setH(double h) {
		Cilindro.h = h;
	}
	public static double getR() {
		return r;
	}
	public static void setR(double r) {
		Cilindro.r = r;
	}
}
