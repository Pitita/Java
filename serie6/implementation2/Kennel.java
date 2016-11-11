package serie6.implementation2;

public class Kennel {

	public static void main(String[] args) {
		Dog dog1 = new Dog(3, "Wuffli");
		Dog dog2 = new Dog(3, "Wuffli");
		Dog dog3 = new Dog(2, "Wuffli");
		Dog dog4 = new Dog(2, "WufflI");
		
		System.out.println(dog1.equals(dog2)); // true
		System.out.println(dog1.equals(dog3)); // false
		System.out.println(dog3.equals(dog4)); // false
	}

}
