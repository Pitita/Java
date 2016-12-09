package serie10.implementation3;

public class Menu {

	private String starter, mainMenu, dessert;
	private double cost;
	
	public Menu(String starter, String mainMenu, String dessert, double cost){
		this.starter=starter;
		this.mainMenu=mainMenu;
		this.dessert=dessert;
		this.cost=cost;
	}
	
	public Menu(){
		this.starter="undefined";
		this.mainMenu="undefined";
		this.dessert="undefined";
		this.cost=0.0;
		
	}
	
	public String toString(){
		String menu="**** LE MENU ****\n";
		menu+="\n";
		menu+=this.starter;
		menu+="\n";
		menu+=this.mainMenu;
		menu+="\n";
		menu+=this.dessert;
		menu+="\n";
		menu+=this.cost;
		return menu;
		
	}
	
}
