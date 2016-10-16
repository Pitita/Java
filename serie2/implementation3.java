package serie2;

import java.util.Scanner;

public class implementation3 {

	public static void main(String[] args) {
		int hours, minutes, seconds, total;
		Scanner s = new Scanner (System.in);
		
		System.out.println("Stunden?");
		hours = s.nextInt();
		
		System.out.println("Minuten?");
		minutes = s.nextInt();
		
		System.out.println("Sekunden?");
		seconds = s.nextInt();
		
		total = seconds + minutes*60 + hours*3600;
		
		System.out.println("");
		System.out.println("Dies entspricht " + total + " Sekunden");

	}

}
