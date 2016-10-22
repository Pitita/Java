package serie3;

import java.awt.Point;
import java.util.Scanner;

public class implementation1 {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		double distance, distance2, distance3;
		Scanner scan = new Scanner(System.in);
		
		// Eingabe Koordinaten x1, x2, y1, y2
		System.out.println("X-Koordinate");
		x1 = scan.nextInt();
		System.out.println("Y-Koordinate");
		x2 = scan.nextInt();
		System.out.println("X-Koordinate");
		y1 = scan.nextInt();
		System.out.println("Y-Koordinate");
		y2 = scan.nextInt();
		
		distance = Math.pow(x1-x2, 2);
		distance += Math.pow(y1-y2, 2);
		distance = Math.sqrt(distance);
		
		// zweite Variante
		distance2 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		// dritte Variante
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		distance3 = p1.distance(p2);
		
		System.out.println(distance + "|" + distance2 + "|" + distance3);
		
	}

}
