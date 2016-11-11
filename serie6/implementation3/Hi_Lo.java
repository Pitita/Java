package serie6.implementation3;

import java.util.Random;
import java.util.Scanner;

public class Hi_Lo {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Random r = new Random();
		int i, j = 0;
		boolean b = false;
		
		i = r.nextInt(100)+1;
		// DEBUG System.out.println(i);
		
		System.out.println("Ratespiel: Eine Zahl 1 bis 100 eingeben!");
		j = s.nextInt();
		
		while(!b)
		{
			if(j == i)
			{
				System.out.println("Gratuliere. Du hast die gesuchte Zahl gefunden!");
				b = true;
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
