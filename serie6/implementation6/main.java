package serie6.implementation6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		Random r = new Random();
		int r1, r2, answer;
		double score=0, attempts=0, quote;
		boolean _continue = true;
		
		while(_continue)
		{
			r1 = r.nextInt(100) +1; r2 = r.nextInt(100) +1;
			
			System.out.println(r1 + " + " + r2 + " = ?");
			answer = s.nextInt();
			
			if(r1+r2==answer)
			{
				System.out.println("Richtig! :-)");
				score++;
				attempts++;
			}
			
			else
			{
				System.out.println("Falsch! :-(");
				attempts++;
			}
			
			System.out.println("Möchten Sie weiter rechnen? (true|false)");
			
			if(!s.nextBoolean())
			{
				_continue = false;
				
				System.out.println("Punktzahl: " + score + " von möglichen " + attempts);
				
				quote = score/attempts;
				NumberFormat nf = NumberFormat.getPercentInstance();
				System.out.println("Quote: " + nf.format(quote));
			}
		}
		
	}

}
