package serie7.implementation1;

import java.util.ArrayList;
import java.util.Random;

import serie4.implementation1.Student;
import serie4.implementation1.Student.Major;

public class School {

	public static void main(String[] args) {
		
		// ! import Student from  serie 4 !
		ArrayList<Student> students = new ArrayList<Student>();
		
		Random r = new Random();
		
		students.add(new Student("Knofensa", Major.Photosynthetik, r.nextInt(99999)));
		students.add(new Student("Marill", Major.Aquatik, r.nextInt(99999)));
		students.add(new Student("Rattfratz", Major.Warzenschweinissmus, r.nextInt(99999)));
		students.add(new Student("Tentoxa", Major.Toxikologie, r.nextInt(99999)));
		students.add(new Student("Tornupto", Major.Phosphorforschung, r.nextInt(99999)));
		students.add(new Student("Miltank", Major.Pokemonismus, r.nextInt(99999)));
		students.add(new Student("Milotic", Major.Aquatik, r.nextInt(99999)));
		students.add(new Student("Brutalanda", Major.Anglizistik, r.nextInt(99999)));
		students.add(new Student("Pachirisu", Major.GuckInDieLuftistik, r.nextInt(99999)));
		students.add(new Student("Amagarga", Major.Psychologie, r.nextInt(99999)));
		students.add(new Student("Folipurba", Major.Boek, r.nextInt(99999)));
		students.add(new Student("Galagladi", Major.Psychologie, r.nextInt(99999)));
		students.add(new Student("Serpifeu", Major.Photosynthetik, r.nextInt(99999)));
		students.add(new Student("Kronjuwild", Major.Philosophie, r.nextInt(99999)));
		students.add(new Student("Zapplardin", Major.LegendOfZeldinik, r.nextInt(99999)));
		students.add(new Student("Chevrumm", Major.Linguistik, r.nextInt(99999)));
		
		System.out.println(students.toString());
		
		for(int i=0;i<students.size();i++)
		{
			students.get(i).setMajor(Major.Philosophie);
		}
		
		System.out.println(students.toString());

	}

}
