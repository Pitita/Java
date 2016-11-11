package serie6.implementation2;

public class Dog {
	private int age;
	private String name; 
	
	// Constructor
	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	// Defaults
	public Dog()
	{
		this.age = -1;
		this.name = "no name";
	}
	
	// Getter & Setter
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	// returns the age of dog multiplied by 7
	public int ageInPersonYear() { return age*7; }
	
	// string representation of Dog
	public String toString() { return "Name: " + name + " | Alter: " + age +  " (" + ageInPersonYear() + ")"; }
	
	// returns if a dog object equals another dog obj
	public boolean equals(Dog dog){ 
		boolean b = false;
		if(this.name.equals(dog.name) && (this.age == dog.age))
		{
			b = true;
		}
		return b;
	}
	
}
