package serie10.implementation3;

import java.util.Scanner;

public class Menucard {

	public static void main(String[] args) {
		System.out.println("Your options: 1 = print menu card; 2 = insert menu; 3 = exit");
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		while(option!=3){
			if(option==1)
			{
				// TODO print the menu card
			if(option==2)
			{
				// TODO insert a menu
			}
			
			System.out.println("Your options: 1 = print menu card; 2 = insert menu; 3 = exit");
			option=scan.nextInt();
			
			}
		}

	}

}
