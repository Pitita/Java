package serie2;

import java.util.Scanner;

public class implementation1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		String name, university, pet;
		int age;
		
		System.out.println("Wie heisst du?");
		name = s.next();
		
		System.out.println("Wie alt bist du");
		age = s.nextInt();
		
		System.out.println("Wie heisst dein Haustier");
		pet = s.next();
		
		System.out.println("Wie lautet der Name deiner Hochschule?");
		university = s.next();
		
		System.out.print("Hallo mein Name ist " 
		+ name
		+ " und ich bin "
		+ age
		+ " Jahre alt. Ich geniesse die Zeit an der "
		+ university
		+ " obschon ich "
		+ pet
		+ " sehr vermisse.");
		
	}

}
