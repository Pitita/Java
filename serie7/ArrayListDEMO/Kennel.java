package serie7.ArrayListDEMO;

import java.util.ArrayList;

public class Kennel {

	public static void main(String[] args) {
		Dog dog1 = new Dog(3, "Wuffli");
		Dog dog2 = new Dog(3, "Fukano");
		Dog dog3 = new Dog(3, "Arkani");
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(dog1);	dogs.add(dog2);	dogs.add(dog3);
		
		System.out.println(dogs);
		
		dogs.remove(dog2);
		
		System.out.println(dogs);
		System.out.println(dogs.size());
		System.out.println(dogs.add(new Dog(27, "hasso")));
		System.out.println(dogs.size());

	}

}
