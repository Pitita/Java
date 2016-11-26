package serie8.implementation1;

public class Kennel {

	public static void main(String[] args) {
		Dog dog1 = new Dog(3, "Wuffli", 20);
		Dog dog2 = new Dog(3, "Wuffli", 20);
		Dog dog3 = new Dog(2, "Wuffli", 10);
		Dog dog4 = new Dog(2, "WufflI", 15);
		
		if(dog1.compareTo(dog2)==0)
			System.out.println("This dog equals the other dog");
		else 
			System.out.println("This dog does not equal the other dog");
		
		if(dog1.compareTo(dog3)==0)
			System.out.println("This dog equals the other dog");
		else 
			System.out.println("This dog does not equal the other dog");
		
	}

}
