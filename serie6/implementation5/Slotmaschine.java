package serie6.implementation5;

import java.util.Random;
import java.util.Scanner;

public class Slotmaschine {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		boolean b1 = false, b2 = false, b3 = false, play_again = true;
		
		while(play_again)
		{
			// Zufallszahlen generierieren RandomZahl1|RandomZahl2|RandomZahl3
			int r1 = r.nextInt(9)+1, r2 = r.nextInt(9)+1, r3 = r.nextInt(9)+1;
			System.out.println("\n" + r1 + "|"  + r2 + "|" + r3);
			
			// Kontrollieren ob der Benutzer etwas gewonnen hat
			
			// Grosser Preis
			if(r1 == r2 && r1 == r3)
			{
				System.out.println("CHACKPOT!!!");
			}
			
			// Kleiner Preis
			else if(r1 == r2 || r1 == r3 || r2 == r3)
			{
				System.out.println("kleiner Chackpot gewonnen :-)");
			}
			
			// Nichts gewonnen
			else
			{
				System.out.println("Das war leider nix.");
			}
			
			// Erneut spielen?
			System.out.println("\nMöchten Sie erneut spielen? (true|false)");
			if(!s.nextBoolean())
			{
				play_again = false;
				System.out.println("Noch einen schönen Tag. Beehren Sie uns bald wieder.");
			}
		}

	}

}
