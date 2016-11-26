package serie9.implementation4;

import java.util.ArrayList;

import serie9.implementation4.Student.Major;

public class Course {
	private String CourseName;
	private int max;
	private ArrayList<Student> courseMembers;
	
	public Course(String courseName, int max)
	{
		this.max = max;
		this.CourseName = courseName;
		this.courseMembers = new ArrayList<Student>();
	}
	
	public void addStudent(Student s)
	{
		if(this.courseMembers.size() >= this.max)
		{
			System.out.println("Klase voll! Warteliste!");
		}
		else
		{
			this.courseMembers.add(s);
		}
	}
	
	public void Roll()
	{
		System.out.println("Kursname " + this.CourseName);
		for(int i=0; i<this.courseMembers.size();i++)
			System.out.println(this.courseMembers.get(i));
	}
	
	public static void main(String[] args){
		Course c = new Course("Math", 50);
		c.addStudent(new Student("Knofensa", Major.Anglizistik, 22));
		c.Roll();
	}
	
	
}
