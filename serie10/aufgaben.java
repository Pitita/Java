package serie10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class aufgaben {

	public static void main(String[] args) {
		/* Aufgabe 1 
		 * Mit dem [Index] wird auf ein Element in der Arraylist referenziert.
		 * Codebeispiel unterhalb:
		 */
		
		int[] values = new int[10];
		System.out.println(values[0]);
		
		/* Aufgabe 2
		 * a) 61
		 * b) 140
		 * c) 70
		 * d) 71
		 * e) 81
		 * f) 11
		 */

		/* Aufgabe 3 */
		int[] counter = new int[6];
		
		/* Aufgabe 4 */
		String[] capitalCities = new String[10];
		
		/* Aufgabe 5 */
		for (int i = 0; i<values.length; i++)
		values[i] = i;
		
		/* Aufgabe 6 */
		for (int i = 0; i<values.length; i++)
			values[i] = i++;
		
		/* Aufgabe 7 */
		int sum = 0;
		for (int i = 0; i<values.length; i++)
		sum += values[i];
		
		System.out.println(sum);
		
		// alternative Lösung
		sum = 0;
		for(int value:values)
			sum+= value;
		
		System.out.println(sum);
		
		/* Aufgabe 8 */
		String[] names = { "Emily", "Clare", "Amanda", "Julie"};
		
		/* Aufgabe 9 */
		// Eclipse -> Run -> Run Configurations -> Arguments -> hello world 2 4
		System.out.println(args[0]); // hello
		System.out.println(args[1]); // world
		
		String temp = args[0] + args[1];
		System.out.println(temp.length()); // 10
		
		/* Aufgabe 10 */
		int tempInt = Integer.parseInt(args[2]) + Integer.parseInt(args[3]);
		System.out.println(tempInt); // 6
		
		/* Aufgabe 11 */
		int[] ia = new int[101];
		for(int i = 0; i < ia.length; i++)
			ia[i] = i;
		sum = 0;
		for(int i = 0; i < ia.length; i++)
			sum+= ia[i];
		System.out.println("SUM:"+sum); // 5050
		
		/* QuickCheck 40 */
		
		int[][] valuez = new int[10][10];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values.length; j++){
				if(valuez[i][j]>max)
					max=valuez[i][j];
					min = Math.min(min, valuez[i][j]);
			}
		}
		System.out.println(min-max);
		
		System.out.println(avgArray(new int[10])); // 0.0
		
		ArrayList ints = new ArrayList();
		ints.addAll(Arrays.asList(2240, 1580, 1280, 30, 40, 38, 27, 2, 4, 5, 8, 9, 20, 2230, 20));
		System.out.println(minFinder(ints)); // 2
		
		System.out.println(reverse(ints)); // [2240, 2230, 1580, 1280, 40, 38, 30, 27, 20, 20, 9, 8, 5, 4, 2]
		
	}
	/* Aufgabe 12 */
	public static double avgArray(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return (sum/arr.length);
	}
	
	/* Aufgabe 13 */
	public static int minFinder(ArrayList<Integer> ints)
	{
		Collections.sort(ints);
		return ints.get(0);
	}
	
	/* Aufgabe 14 */
	public static ArrayList<Integer> reverse(ArrayList<Integer> ints)
	{
		Collections.reverse(ints);
		return ints;
	}

}
