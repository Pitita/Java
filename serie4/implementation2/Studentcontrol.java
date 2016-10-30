package serie4.implementation2;

import java.util.Scanner;

import serie4.implementation1.Student;
import serie4.implementation1.Student.Major;

public class Studentcontrol {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Name?");
		String name = s.next();
		
		System.out.print("Major?");
		Major major = Major.valueOf(s.next());
		
		System.out.print("MatrNr?");
		int matrNr = s.nextInt();
		
		Student student = new Student(name, major, matrNr); // references serie4.implementation1.Student.Student()
		System.out.println(student);

	}
}
