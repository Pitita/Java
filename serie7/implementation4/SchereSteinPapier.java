package serie7.implementation4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		final String SCHERE = "SCHERE";
		final String PAPIER = "PAPIER";
		final String STEIN = "STEIN";
		final String y = "Y";
		
		ArrayList<String> symbols = new ArrayList<String>();
		symbols.add(SCHERE);
		symbols.add(STEIN);
		symbols.add(PAPIER);
		
		System.out.println("Bitte wählen Sie Schere, Stein oder Papier!");
		String userPick = s.nextLine().toUpperCase();
		
		do
		{
			
			while(symbols.indexOf(userPick) < 0)
			{
				System.out.println("Bitte wählen Sie Schere, Stein oder Papier!");
				
				userPick = s.nextLine().toUpperCase();
				
				// DEBUG
				// System.out.println("userPick:" +userPick);
				// System.out.println("indexOf:" + symbols.indexOf(userPick));
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
				if(userPick.equals(SCHERE)){
					if(computerSymbol.equals(STEIN)){
						System.out.println("Computer gewinnt");
					}
					else
					{
						System.out.println("Spieler gewinnt");
					}
				}
				
				if(userPick.equals(STEIN)){
					if(computerSymbol.equals(PAPIER)){
						System.out.println("Computer gewinnt");
					}
					else
					{
						System.out.println("Spieler gewinnt");
					}
				}
				
				if(userPick.equals(PAPIER)){
					if(computerSymbol.equals(SCHERE)){
						System.out.println("Computer gewinnt");
					}
					else
					{
						System.out.println("Spieler gewinnt");
					}
				}
				
			}
			userPick = "";
			System.out.println("Möchten Sie erneut spielen (Y/N)?");
		} while(y.equalsIgnoreCase(s.nextLine()));
	}

}
