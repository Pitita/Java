package serie10;

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
		// Eclipse -> Run -> Run Configurations -> Arguments
		System.out.println(args[0]); // hellowww
		System.out.println(args[1]); // world
		
		/* Aufgabe 10 */
		
		
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
	}

}
