package serie2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
	// 1a)
		int count = 0, value, toal;
		final int MAX_VALUE = 100;
		int myValue = 50;
		
		// 5x deklariert
		// 3x besitzen initialen Wert
		
	// 1b) t, t, t f"
		
	// 2)
		int countCD = 0;
		final int FT_PER_MILE = 5280;
		
	// 3) Genau 1 Wert kann int speichern
		
	// 4)
		int diameter = 5;
		diameter *= 4;
		System.out.println("Aufgabe 4) " + diameter);
		
	// 5)
		System.out.println(19%5); // 4
		System.out.println(13/4); // 3
		
	// 6)
		int result = 27;
		result += 3;
		result /= 7;
		result *= 2;
		System.out.println(result); // 8
		
	// 7
		result = 10;
		result += 10;
		result *= result;
		result /= result;
		result -= 10;
		System.out.println(result); // -9

	// 8
		int base;
		base = 5;
		result = base +3;
		base = 7;
		System.out.println(result); // 8
		
	// 9
		result = 100;
		result -= 17;
		System.out.println(result); // 83
		
	// 10
		result = 15;
		int total = 100, MIN = 15, num = 10;
		result /= (total-MIN) % num;
		System.out.println(result); // 3
		
	// 11
	double _result = 27.32;
	value = 15;
	value = (int) _result;
	System.out.println("Result: " + _result);
	System.out.println("Value: " + value);
	
	// 12
	int iResult, num1 = 17, num2 = 5;
	double fResult, val1 = 12.0, val2 = 2.34;
	
	iResult = num1 / num2;
	System.out.println(iResult); // 3
	
	fResult = num1 / num2;
	System.out.println(fResult); // 3.0
	
	fResult = val1 / num2;
	System.out.println(fResult); // 2.4
	
	fResult = (double) num1 / num2;
	System.out.println(fResult); // 3.4
	
	fResult = (int) val1 / num2;
	System.out.println(fResult); // 2.0
			
	}

}
