package serie2;

import java.util.Scanner;

public class aufgaben {

	public static void main(String[] args) {
	
	// 1a)
		int count = 0, value, toal;
		final int MAX_VALUE = 100;
		int myValue = 50;
		
		// 5x Variablen deklariert
		// 3x Variablen besitzen initialen Wert
		
	/* 1b) 
	 * myValue = 100; // true
	 * MAX_VALUE = 50; // false, weil die Variable MAX_VALUE mit "final" initalisiert wurde, darf sie nicht überschrieben werden!
	 * count = -1; // true
	 * total = 5.43; // false, weil die Variable total als Integer definiert ist und somit keine Kommazahl speichern kann! 
	*/
		
	// 2)
		int countCD = 0;
		final int FT_PER_MILE = 5280;
		
	// 3) int kann genau 1 Wert speichern
		
	// 4)
		int diameter = 5;
		diameter *= 4;
		System.out.println("4) " + diameter); // 20
		
	// 5)
		System.out.println("5) " + 19%5); // 4
		System.out.println("5) " + 13/4); // 3
		
	// 6)
		int result = 27;
		result += 3;
		result /= 7;
		result *= 2;
		System.out.println("6) " + result); // 8
		
	// 7)
		result = 10;
		result += 10;
		result *= result;
		result /= result;
		result -= 10;
		System.out.println("7) " + result); // -9

	// 8)
		int base;
		base = 5;
		result = base +3;
		base = 7;
		System.out.println("8) " + result); // 8
		
	// 9)
		result = 100;
		result -= 17;
		System.out.println("9) " + result); // 83
		
	// 10)
		result = 15;
		int total = 100, MIN = 15, num = 10;
		result /= (total-MIN) % num;
		System.out.println("10) " + result); // 3
		
	// 11)
	double _result = 27.32;
	value = 15;
	value = (int) _result;
	System.out.println("11) Result: " + _result); // 27.32 (Double)
	System.out.println("11) Value: " + value); // 27 (Int)
	
	// 12)
	int iResult, num1 = 17, num2 = 5;
	double fResult, val1 = 12.0, val2 = 2.34;
	
	iResult = num1 / num2;
	System.out.println("12a) " + iResult); // 3
	
	fResult = num1 / num2;
	System.out.println("12b) " + fResult); // 3.0
	
	fResult = val1 / num2;
	System.out.println("12c) " + fResult); // 2.4
	
	fResult = (double) num1 / num2;
	System.out.println("12d) " + fResult); // 3.4
	
	iResult = (int) val1 / num2;
	System.out.println("12e) " + iResult); // 2
			
	}

}
