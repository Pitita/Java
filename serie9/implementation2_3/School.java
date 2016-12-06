package serie9.implementation2_3;

import java.util.ArrayList;
import java.util.Random;

public class School {

	public static void main(String[] args) {
		
ArrayList<Student> studList = new ArrayList<Student>();
		
		studList.add(new Student("Hans", Major.Math, 111));
		studList.add(new Student("Peter", Major.Info, 222));
		studList.add(new Student("Frunz", Major.WI, 333));
		studList.add(new Student("Walter", Major.Philosophie, 444));
		
		Student s1 = new Student("Fritz", Major.Math, 345);
		Student s2 = new Student("Paul", Major.Info, 987);
		
		s1.setTestScore(1, 17);
		s2.setTestScore(2, 900);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.getTestScore(2));
		System.out.println(s1.getTestScore(1));
		int result = s2.getTestScore(2);
		System.out.println(result);

		
	}

}
