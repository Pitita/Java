package serie9.implementation2;

import java.util.ArrayList;

public class Student {
	
	public enum Major {Math, Info, Wi, Philosophie, Germanistik, Anglizistik, Linguistik, Boek, Psychologie, Warzenschweinissmus, Physik, Pokemonismus, GuckInDieLuftistik, LegendOfZeldinik, Xenobladetastisch, Phosphorforschung, Aquatik, Photosynthetik, Toxikologie }

	// Studentenname
	private String name;
	
	// Hauptfach
	private Major major;
	
	// Matrikelnummer
	private int matrNr;
	
	private final static int MAX_TESTS = 3;
	
	private ArrayList<Integer> scores;
	
	// Konstruktor
	public Student(String name, Major major, int matrNr)
	{
		this.name = name; // Diese Variable oben = name;
		this.major = major;
		this.matrNr = matrNr;
		for(int i = 0; i < MAX_TESTS; i++)
		this.scores.add(8);
	}
	
	public void setTestScore(int testNumber, int score)
	{
		if(testNumber >= 1 && testNumber <= this.MAX_TESTS)
			this.scores.set(testNumber-1, score);
	}
	
	public int getTestscore(int testNumber)
	{
		if(testNumber >= 1 && testNumber <= this.MAX_TESTS)
			return this.scores.get(testNumber);
		else
			return -1;
	}
	
//	public String toString()
//	{
//		return name + " | " + major + " | " + matrNr + "| AVG " + this.getAvg();
//	}
	
	// Getter
	public String getName()
	{
		return name;
	}
	
	public Major getMajor()
	{
		return major;
	}
	
	public int getMatrNr()
	{
		return matrNr;
	}
	
	// Setter
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setMajor(Major major)
	{
		this.major = major;
	}
	
	public void setMatrNr(int matrNr)
	{
		this.matrNr = matrNr;
	}
	
	public double getAvg(){
		double sum = 0;
		for (int i = 0; i< this.MAX_TESTS; i++)
			sum += this.scores.get(i);
		return sum / this.MAX_TESTS;
	}
}
