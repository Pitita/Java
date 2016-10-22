package serie3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomTester {

	public static void main(String[] args) {
		RandomTester RT = new RandomTester();
		
		// RT.getRandomRange(firstValue, secondValue);
		RT.getRandomRange(25, 0);
		RT.getRandomRange(6, 1);
		RT.getRandomRange(100, 10);
		RT.getRandomRange(50, 100);
		RT.getRandomRange(10, -5);
		RT.getRandomRange(22, 12);
		RT.getRandomRange(13, 0);
		RT.getRandomRange(20, 1);
		RT.getRandomRange(6, 15);
		RT.getRandomRange(11, -10);
	}
	
	public void getRandomRange(int firstValue, int secondValue)
	{
		Random r = new Random();
		ArrayList<Integer> al = new ArrayList<Integer>(); // Liste mit beliebig vielen Int-Werten.
		
		for(int i=0; i<1000; i++) // Standardmässig ist die "Genauigkeit" auf 1000 eingestellt. Kann bei Bedarf erhöht werden. (Je höher desto öfter wird Random() durchgeführt und desto genauer wird das Ergebnis)
		{
			al.add(r.nextInt(firstValue) + secondValue); // Das Ergebnis von nextInt() wird in die Arraylist al gespeichert.
		}
		
		Collections.sort(al); // ArrayList wird sortiert (tiefste Zahl zu erst)
		System.out.print("[" + al.get(0)); // Erstes Element der Arraylist wird ausgegeben
		
		Collections.reverse(al); // ArrayList wird invertiert (höchste Zahl zu erst)
		System.out.println(", " + al.get(0) + "]"); // Erstes Element der Arraylist wird ausgegeben
	}

}
