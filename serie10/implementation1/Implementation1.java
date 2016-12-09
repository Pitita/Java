package serie10.implementation1;

import java.util.Scanner;

public class Implementation1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ints = new int[10];
		String decision = "Y";
		
		System.out.println("Bitte geben Sie 10 Ganzzahlen ein!");
		
		for(int i = 0; i < ints.length; i++){
			ints[i]=s.nextInt();
		}
		
		while(decision.equalsIgnoreCase("y"))
		{
			boolean b = false;
			
			System.out.println("Bitte geben Sie die Suchzahl ein!");
			int search = s.nextInt();
			
			for(int i = 0; i<ints.length; i++){
				if(ints[i] == search){
					b = true;
				}
			}
			
			if(b){
				System.out.println("Zahl gefunden!");
			}
			else{
				System.out.println("Zahl wurde nicht gefunden!");
			}
			
			System.out.println("Nochmals suchen? (Y/N)");
			decision = s.next();
		}
	}
}
