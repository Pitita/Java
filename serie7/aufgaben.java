package serie7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import serie5.Dice;

public class aufgaben {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Aufgabe 1 */
		System.out.println("Aufgabe1:");
		Scanner filescan = new Scanner(new File("urls.txt"));
		
		int charSum = 0, lineCount = 0;
		
		while(filescan.hasNext())
		{
			String line = filescan.nextLine();
			charSum += line.length();
			lineCount++;
		}
		
		System.out.println((double) charSum / lineCount);
		
		/* Aufgabe 2 */
		System.out.println("Aufgabe2:");
		Scanner scan = new Scanner (System.in);
		int input = scan.nextInt();
		
		while(input > 0)
		{
			System.out.println("positiv!");
			input = scan.nextInt();
		}
		
		/* Aufgabe 3 */
		// Objekte oder Objektvariabeln. Sie können keine primitive Daten speichern (dies geht nur mit Wrapper Klassen)
		
		/* Aufgabe 4 */
		ArrayList<Dice> dices = new ArrayList<Dice>();
		dices.add(new Dice());
		//oder
		Dice d = new Dice();
		dices.add(d);
		
		/* Aufgabe 5 */
		// default wird ausgeführt, falls definiert. ansonsten wird gar nichts ausgeführt
		
		/* Aufgabe 6 */
		// alle Anweisungen werden ausgeführt
		
		/* Aufgabe 7 */
		boolean first = false;
		char charid = 'X';
		charid = (first) ? 'A' : 'B';
		
		/* Aufgabe 8 a
		 0
		 1
		 2
		 3
		 4
		 5
		 6
		 7
		 8
		 9
		 */
		
		/* Aufgabe 8 b
		10
		 */
		
		/* Aufgabe 9 */
		System.out.println("Aufgabe9:");
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		do {
			sum += scan.nextInt();
		} while (scan.nextInt()!=0);
		System.out.println(sum);
		
		/* Aufgabe 10a */
		// 10 + 20 + 30 + 40 = 
		// Ausgabe: 100
		
		/* Aufgabe 10b */
		// 10 + 20 + 30
		// Ausgabe: 60
		
		/* Aufgabe 11 */
		System.out.println("Aufgabe11:");
		for(int i=2; i<99; i=i+2)
		{
			System.out.println(i);
		}
		
		/* Aufgabe 12 */
		System.out.println("Aufgabe12:");
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for(int i=0; i<10; i++)
		{
			ints.add(scanner.nextInt());
		}
		System.out.println(ints.toString());
		
		int temp = 0;
		for(int i=0;i<ints.size();i++)
		{
			temp += ints.get(i);
		}
		System.out.println(temp);
		
		/* Aufgabe s.130: if/else Anweisungen in ein Switch Statement umwandeln */
		char myChar = 'W';
		int num = 5;
		
		switch(num)
		{
			case '6':
				myChar = 'X';
				break;
			case '7':
				myChar = 'Y';
				break;
			default:
				myChar = 'Z';
				break;
		
		}
	}
}
