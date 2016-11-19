package serie7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import serie5.Dice;

public class aufgaben {

	public static void main(String[] args) throws FileNotFoundException {
		
		/* Aufgabe 1
		http://wi.epizy.com/wp-content/uploads/2016/11/urls.txt
		file must be placed in project directory! example C:\Users\Mat\Documents\workspace\Java\ urls.txt 
		*/
		
		System.out.println("Aufgabe1:");
		Scanner filescan = new Scanner(new File("urls.txt")); 

		int charSum = 0, lineCount = 0;
		
		while(filescan.hasNext())
		{
			String line = filescan.nextLine();
			charSum += line.length();
			lineCount++;
		}
		
		System.out.println((double) charSum / lineCount); // 24.0
		
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
		boolean exit = false;
		do {
			int userInput = scan.nextInt(); 
			if(userInput==0)
			{
				exit = true;
			}
			else
			{
				sum += userInput;
			}
			
		} while (!exit);
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
		
		System.out.println(Collections.max(ints));
		
		/* Aufgabe 13 */
		System.out.println("Aufgabe13:");
		String temp = "Er strebt im Glück wie noch keiner! Soll sich das mal jemand ansehen. Da fallen einem die Augen aus dem Kopf. Ein wahrlich verblüffender und partout nicht sympathischer Anblick dessen, was noch von ihm übrig ist!";
		char[] temps = temp.toCharArray();
		int count = 0;
		
		for(int i=0;i<temps.length;i++)
		{
			if(temps[i] == 'a')
			{
				count++;
			}
		}
		System.out.println(count+"x 'a' gefunden"); // 11
		
		
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
		
		/* Aufgabe 14: Testing */
		System.out.println("Aufgabe 14;");
		System.out.println(alarm(2)); // Alarm! Alarm!
		
		/* Aufgabe 15: Testing */
		System.out.println("Aufgabe 15:");
		
		System.out.println(sumRange(2,1));
		// Error. 'high' ist kleiner als 'low'! Bitte versuchen Sie es erneut
		// 0

		System.out.println(sumRange(1,2)); 
		// 3
	}
	
	/* Aufgabe 14: Methode alarm() */
	private static String alarm(int num){
		String s = "";
		for(int i=0;i<num;i++)
		{
			s += " Alarm!";
		}
		return s;
	}
	
	/* Aufgabe 15: Methode sumRange() */
	private static int sumRange(int low, int high)
	{
		int returnValue = 0;
		
		if(high < low)
		{
			System.out.println("Error. 'high' ist kleiner als 'low'! Bitte versuchen Sie es erneut");
		}
		else
		{
			returnValue = low+high;
		}
		
		return returnValue;
	}
}
