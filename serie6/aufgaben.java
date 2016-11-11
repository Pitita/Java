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
		
		/* Aufgabe 7 a)
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
		
		/* Aufgabe 9 */
		
		/* Aufgabe 10 */
		
		/* Aufgabe 11 */
		
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

}
