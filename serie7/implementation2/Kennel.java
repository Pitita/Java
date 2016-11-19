package serie7.implementation2;

import java.util.ArrayList;

public class Kennel {

	public static void main(String[] args) {
		Dog dog1 = new Dog(3, "Wuffli");
		Dog dog2 = new Dog(3, "Fukano");
		Dog dog3 = new Dog(3, "Arkani");
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(dog1);	dogs.add(dog2);	dogs.add(dog3);
		
		System.out.println(dogs);
		// [Name: Wuffli | Alter: 3 (21), Name: Fukano | Alter: 3 (21), Name: Arkani | Alter: 3 (21)]
		
		dogs.remove(dog2);
		System.out.println(dogs);
		// [Name: Wuffli | Alter: 3 (21), Name: Arkani | Alter: 3 (21)]
				
		System.out.println(dogs.size());
		// 2
		
		System.out.println(dogs.add(new Dog(27, "hasso")));
		System.out.println(dogs.size());
		// 3
		
		System.out.println(dogs.indexOf(dog3)); 
		// 1
		
		System.out.println(dogs.contains(dog2));
		// false
		
		System.out.println(dogs.contains(dog3));
		// true
				


	}

}
