package serie6.implementation4;

import java.util.Random;
import java.util.Scanner;

public class Hi_Lo {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Random r = new Random();
		int i, j = 0;
		boolean b = false;
		
		i = r.nextInt(100)+1;
		// System.out.println(i); // DEBUG: zeigt die gesuchte Zahl an
		
		System.out.println("Ratespiel: Eine Zahl 1 bis 100 eingeben!");
		j = s.nextInt();
		
		while(!b)
		{
			if(j == i)
			{
				System.out.println("Gratuliere. Sie haben die gesuchte Zahl gefunden!");
				System.out.println("Möchten Sie erneut spielen? (true|false)");
				if(s.nextBoolean())
				{
					i = r.nextInt(100)+1;
					System.out.println("Ratespiel: Eine Zahl 1 bis 100 eingeben!");
					j = s.nextInt();
				}
				else
				{
					b = true;
					System.out.println("Noch einen schönen Tag. Beehren Sie uns bald wieder.");
				}
				
			}
			else if(j < i)
			{
				System.out.println("die gesuchte Zahl ist grösser");
				j = s.nextInt();
			}
			else if(j > i)
			{
				System.out.println("die gesuchte Zahl ist kleiner");
				j = s.nextInt();
			}
		
		}
	}

}
