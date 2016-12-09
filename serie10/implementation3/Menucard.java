package serie10.implementation3;

import java.util.Scanner;

public class Menucard {
	private final int MAX_MENUS = 10;
	private Menu[] menus;
	private int menuCount;
	
	public Menucard()
	{
		this.menus = new Menu[MAX_MENUS];
		this.menuCount = 0;
	}
	
	public void print(){
		System.out.println("ALL MENUS ON THIS CARD");
		for(int i = 0; i < menuCount; i++)
			System.out.println(this.menus[i]);
	}
	
	public void insertMenu() {
		if(this.menuCount<this.MAX_MENUS)
		{
			Scanner s = new Scanner(System.in);
			
			System.out.println("Starter?");
			String starter = s.nextLine();
			System.out.println("Main?");
			String mainCourse = s.nextLine();
			System.out.println("Dessert?");
			String dessert = s.nextLine();
			System.out.println("Cost?");
			double cost = s.nextDouble();
			Menu newMenu = new Menu(starter, mainCourse, dessert, cost);
			this.menus[menuCount] = newMenu;
			menuCount++;
		}
		else
		{
			System.err.println("Menucard is complete!");
		}
	}
	
	public static void main(String[] args) {
		Menucard menucard = new Menucard();
		
		System.out.println("Your options: 1 = print menu card; 2 = insert menu; 3 = exit");
		
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		while(option!=3){
			if(option==1)
			{
				menucard.print();
			if(option==2)
			{
				menucard.insertMenu();
			}
			
			System.out.println("Your options: 1 = print menu card; 2 = insert menu; 3 = exit");
			option=scan.nextInt();
			
			}
		}

	}

}
