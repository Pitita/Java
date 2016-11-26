package serie8.implementation1;

public class Dog implements Comparable<Dog> {
	private int age, weight;
	private String name; 
	
	// Constructor
	public Dog(int age, String name, int weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	// Defaults
	public Dog()
	{
		this.age = -1;
		this.name = "no name";
		this.weight = 1;
	}
	
	// Getter & Setter
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	public int getWeight() { return this.weight; }
	public void setWeight(int weight) { this.weight = weight; }
	
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

	public int compareTo(Dog otherDog) {
		return this.weight - otherDog.weight;
	}
	
}
