package serie6.implementation5;

import java.util.Random;
import java.util.Scanner;

public class JackpotTest {

		public static void main(String[] args) {
			
			Random r = new Random();
			Scanner s = new Scanner(System.in);
			boolean b1 = false, b2 = false, b3 = false, chackpot = false;
			
			int runner = 0;
			
			while(!chackpot)
			{
				// Zufallszahlen generierieren RandomZahl1|RandomZahl2|RandomZahl3
				int r1 = r.nextInt(9)+1, r2 = r.nextInt(9)+1, r3 = r.nextInt(9)+1;
				
				// Kontrollieren ob der Benutzer etwas gewonnen hat
				if(r1 == r2 && r1 == r3)
				{
					System.out.println(r1 + "|"  + r2 + "|" + r3);
					
					System.out.println("JACKPOT!!!");
					
					System.out.println(runner-- +" Anläufe ");
					
					chackpot = true;
				}
				else
				{
					runner++;
				}
			}

		}

	}
