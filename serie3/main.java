package serie3;

import java.util.Random;

public class main {

	public static void main(String[] args) {
	
		// Der new Operator ruft den Konstruktor einer Klasse auf und erzeugt ein Objekt dieser Klasse. Als Rücckgabe erhält man vom Konstruktor eine Adresse auf das erzeugte Objekt. Bspw. wird mit String newString = new String("Hallo"); ein neus Objekt vom Typ String erzeugt. Die ADresse dieses neuen Obejts wird in der Variablen newString abgelegt.
		// WICHTIG; Konstruktor, Objekt, Adresse
		
		// 2. 
		String s = "HALLO-WELT";
		int size = s.length();
		
		// 3. unerwünschte Änderungen
		// Variabeln, die auf das gleiche Objekt zeigen. Zeigen zwei unterschiedliche Variablen obj1 und obj2 auf das gleiche Objekt und ändert man zB den Status von obj1 ab, so ändert sich (unerwünschterweise) auch der Status von obj2.
		
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
		System.out.println();
		
		// QuickCheck12
		// [0, 24]
		// [1, 6]
		// [10, 109]
		// [100, 149]
		// [-5, 4]
		// [12, 33]
		
		Random r = new Random();
		System.out.print(r.nextInt(100)+10);
		
		
		// [0, 12]
		// -rand.nextInt(11); oder // rand.nextInt(11) -10;
		
		// [1, 20]
		//
		
		// [15, 20]
		//
		
		// [-10, 0]
		//
	
	}
	
}
