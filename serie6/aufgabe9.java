package serie6;

import java.util.ArrayList;

public class aufgabe9 {
	
	public static void main(String[] args) {
		
		/* Aufgabe 9 */
		System.out.println("Aufgabe 9:");
		
		int value = 4, runner = 1;
		for(int i=1;i<=value;i++)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();

			while(runner <= value){
				if(i%runner==0)
				{
					al.add(runner);
				}
				runner++;
			}
			runner = 1;
			
			System.out.println("divisors of " + i + ": " + al.toString()); 
		}
	}
	
	/* Alternative Lösung
	int value = 10;
	int min = 1;
		
	while(min <= value){
		int runner = 1;
		System.out.print("Divisor of " +min+ ": ");
		while(runner <= min){
			if (min%runner == 0){
				System.out.print(runner + ", ");
				runner++;
			}
			else {
				runner++;
			}
		}
		min++;
		System.out.println();
	}
	*/
}

