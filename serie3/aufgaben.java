package serie3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class aufgaben {

	public static void main(String[] args) {
	
		// 1. Der new Operator ruft den Konstruktor einer Klasse auf und erzeugt ein Objekt dieser Klasse. Als Rücckgabe erhält man vom Konstruktor eine Adresse auf das erzeugte Objekt. Bspw. wird mit String newString = new String("Hallo"); ein neus Objekt vom Typ String erzeugt. Die ADresse dieses neuen Obejts wird in der Variablen newString abgelegt.
		// WICHTIG: Konstruktor, Objekt, Adresse
		
		// 2. 
		String s = "HALLO-WELT";
		int size = s.length();
		
		// 3. Variabeln, die auf das gleiche Objekt zeigen. Zeigen zwei unterschiedliche Variablen obj1 und obj2 auf das gleiche Objekt und ändert man zB den Status von obj1 ab, so ändert sich (unerwünschterweise) auch der Status von obj2.
		// WICHTIG: unerwünschte Änderungen
		
		// 4
		String s1 = "Amanda", s2 = "Bobby", s3 = "Chris";
		System.out.println(s1); // Amanda
		System.out.println(s2.replace('B', 'M')); // Mobby
		System.out.println(s2); // Bobby
		s3 = s2.concat(s1); // 
		System.out.println(s2); // Bobby
		System.out.println(s3); // BobbyAmanda
		System.out.println(s1.charAt(1)); // m
		s3 = s3.substring(0,3); //
		System.out.println(s3.toUpperCase()); // BOB
		System.out.println(s3.length()); // 3	
		System.out.println("-------------------");
		
		// 5 Statische Methoden können ohne den new Operator aufgerufen werden.
		// BSP: die Methode Pow ist eine statische Methode: math.pow(2, 2);
		
		// 6. 
		// 125
		// 4
		// 20
		// 5
		System.out.println("Aufgabe 6");
		System.out.println(Math.pow(5, 3));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.abs(10) + Math.abs(-10));
		System.out.println(Math.ceil(4.2));
		System.out.println("-------------------");
		
		// 7.
		System.out.println("Aufgabe 7");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double cost = 99.0158;
		System.out.println(nf.format(cost));
		System.out.println("-------------------");
		
		// 8.
		System.out.println("Aufgabe 8");
		double d;
		Scanner scan = new Scanner(System.in);
		System.out.println("KOMMAZAL EINGEBEN");
		d = scan.nextDouble();
		d = Math.sqrt(Math.abs(d));
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.##");
		
		System.out.println(df.format(d));
		
		System.out.println("-------------------");
		
		// 9.
		System.out.println("Aufgabe 9");
		
		System.out.println("ZAHL EINGEBEN");
		int i = scan.nextInt();
		
		System.out.println("KOMMAZAHL EINGEBEN");
		d = scan.nextDouble();
		
		System.out.println(Math.pow(d, i));		
		
		System.out.println("-------------------");
		
	}
	
}
