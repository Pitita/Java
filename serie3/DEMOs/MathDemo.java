package serie3.DEMOs;

public class MathDemo {

	public static void main(String[] args) {
		int i = -99; 
		double d = -99.001, d_ = 99.001;
		
		System.out.println(Math.abs(i)); // 99
		System.out.println(Math.cos(d_)); // Gibt den Cosinus von d_ an.
		System.out.println(Math.ceil(d) + " | " + Math.ceil(d_)); // -99.0 | 100
		System.out.println(Math.floor(d) + " | " + Math.floor(d_)); // -100.0 | 99.0
		System.out.println(Math.exp(d) + " | " + Math.exp(d_)); // 1.0102107765600848E-43 | 9.898924295830084E42
		System.out.println(Math.pow(2, 2)); // 4
		System.out.println(Math.sqrt(4)); // 2

	}

}
