package serie6;

public class aufgaben {

	public static void main(String[] args) {
	
		/* Aufgabe 1 
		 * a) true 
		 * b) true
		 * c) false
		 * d) true
		 * e) true
		 * f) true
		 * g) true
		 * h) false
		 * i) true
		 * */
		
		/* Aufgabe 2
		 done		value>0		!done	(value>0||!done)
			f		f			w		w
			f		w			w		w
			w		f			f		f
			w		w			f		w
		 */
		
		/* Aufgabe 3 
		(a) num1 = 5 und num2 = 4 // red orange white green
		(b) num1 = 5 und num2 = 12 // black blue green
		(c) num1 = 5 und num2 = 27 // yellow green
		 */
		
		/* Aufgabe 4 */
		System.out.println("Aufgabe4:");
		int temp = 25;
		
		if(temp <= 14)
		{
			System.out.println("Es ist kalt\nZiehen Sie sich warm an..");
		}
	
		else if(temp >= 15 && temp <= 24)
		{
			System.out.println("Es ist angenehm!\nZiehen Sie sich angenehem an..");
		}
		
		else if(temp > 24)
		{
			System.out.println("Es ist warm!\nZiehen Sie sich leicht an..");	
		}
		
		/* Aufgabe 5 
		 * Ungenauigkeit des Rechners / unirrelevante Unterschiede. 
		 * BSP 15.000000000001 und 15.0000000000000000001 ist nicht dasselbe */
		
		
		/* Aufgabe 6 */
		String s1 = "", s2 = "";
		s1.equals(s2); // Mittels STRING.equals können String Objekte miteinander verglichen werden;
		System.out.println(s1.equals(s2)); // true
		
		/* Aufgabe 7 
		  a)
		  1
		  2
		  3
		  4
		  5
		  6
		  7
		  8
		  9
		  b) keine Ausgabe
		  c) 0 - Endlosschlefie
		 */
		
		/* Aufgabe 8 */
		System.out.println("Aufgabe 8:"); 
		
		final int MIN = 35, MAX = 90;
		int runner = MIN;
		
		while(runner <= MAX)
		{
			if(runner%2==0)
			{
				System.out.println(runner);
			}
			runner++;
		}
		
		/* Aufgabe 9 in separatem File */
		
		/* Aufgabe 10 */
		System.out.println("Aufgabe10:");
		int value1 = 10, value2 = 20;
		int result = MaxofTwo(value1, value2); // Methode MaxofTwo ist unten deklariert
		System.out.println(result); // 20
		
		/* Aufgabe 11 */
		System.out.println("Aufgabe11:");
		double d1 = 20.55, d2 = 20.551;
		boolean result_ = Larger(d1, d2); // Methode Larger ist unten deklariert
		System.out.println(result_); // false
		
		/* QuickCheck 20 
		 red white yellow
		 blue yellow
		 blue yellow
		 */
		
		/* QuickCheck 24
		 0 1 2 3 4 5 6 7 8 9 10
		   1 2 3 4 5 6 7 8 9 10
		 	 2 3 4 5 6 7 8 9 10
		 	   3 4 5 6 7 8 9 10
		 	     4 5 6 7 8 9 10
		 	       5 6 7 8 9 10
		 	         6 7 8 9 10
		 	           7 8 9 10
		 	             8 9 10
		 	               9 10
		 	                 10
		 */	
	}
	
	private static boolean Larger(double d1, double d2) {
		boolean b = false;
		
		if(d1 > d2)
		{
			b = true;
		}
		
		return b;
	}

	private static int MaxofTwo(int value1, int value2) {
		return Math.max(value1, value2);
	}

}
