package serie2;

import java.util.Scanner;

public class implementation4 {

	public static void main(String[] args) {
		double länge, breite, fläche, umfang;
		Scanner s = new Scanner (System.in);
		
		System.out.println("Länge des Rechtecks?");
		länge = s.nextDouble();
		
		System.out.println("Breite des Rechtecks?");
		breite = s.nextDouble();
		
		fläche = länge * breite;
		umfang = 2*länge + 2*breite;
		
		System.out.println("Umfang = " + umfang);
		System.out.println("Fläche = " + fläche);
		
	}

}
