package serie7.implementation4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> symbols = new ArrayList<String>();
		symbols.add("Schere");
		symbols.add("Stein");
		symbols.add("Papier");
		
		System.out.println("Bitte wähle Schere Stein oder Papier");
		String userPick = s.nextLine();
		
		while(symbols.indexOf(userPick) == -1)
		{
			System.out.println("Schere, Stein oder Papier!");
			userPick = s.nextLine();
		}
		
		int computerPick = r.nextInt(symbols.size());
		String computerSymbol = symbols.get(computerPick);
		System.out.println("Computer picks: " + computerSymbol);
		
		if(userPick.equals(computerSymbol))
		{
			System.out.println("Unentschieden");
		}
		else
		{
			if(userPick.equals("Schere")){
				if(computerSymbol.equals("Stein")){
					System.out.println("Computer gewinnt");
				}
			}
			
			if(userPick.equals("Schere")){
				if(computerSymbol.equals("Stein")){
					System.out.println("Computer gewinnt");
				}
			}
			
			if(userPick.equals("Schere")){
				if(computerSymbol.equals("Stein")){
					System.out.println("Computer gewinnt");
				}
			}
			
		}
		
		//decision.equalsIgnoreCase("Y")
	}

}
