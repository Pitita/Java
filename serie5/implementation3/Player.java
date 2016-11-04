package serie5.implementation3;

public class Player {
	
	// Instanzdaten
	private String name;
	private int age;
	
	// Constructor
	public Player(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int getAge() { return this.age; }
	public String getName () { return this.name; }
	public void setAge(int age) { this.age = age; }
	public void setName(String Name) { this.name = name; }
	
	public String toString() { return this.name+" "+this.age; }
	
}
