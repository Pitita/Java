package serie2;

import java.util.Scanner;

public class implementation2 {

	public static void main(String[] args) {
		double num1, num2, sum, diff, prod, quot;		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Bitte geben Sie eine Kommazahl ein: ");
		num1 = s.nextDouble();
				
		System.out.println("Bitte geben Sie eine zweite Kommazahl ein: ");
		num2 = s.nextDouble();
		
		sum = num1 + num2;
		diff = num1 - num2;
		prod = num1 * num2;
		quot = num1 / num2;
		
		System.out.println("Summe: "+ sum);
		System.out.println("Differenz: " + diff);
		System.out.println("Produkt: " + prod);
		System.out.println("Quotient: " + quot);

	}

}
