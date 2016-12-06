package serie9.implementation2_3;

import java.util.ArrayList;

enum Major {Info, Math, WI, Philosophie};

public class Student {
	
	//instanzvariablen deklarieren
	private String name;
	private Major major;
	private int matrNr;
	public final static int MAX_TESTS = 3;
	private ArrayList<Integer> scores;
	
	//konstructor
	public Student(String name, Major major, int matrNr){
		this.name = name;
		this.major = major;
		this.matrNr = matrNr;
		
		this.scores = new ArrayList<Integer>();
		for (int i = 0; i < MAX_TESTS; i++){
			this.scores.add(0);
		}
	}
	
	//testNumber is from [1,MAX_TESTS], score is an arbitrary value
	public void setTestScore(int testNr, int score){
		if (testNr >= 1 && testNr <= this.MAX_TESTS){
			scores.set(testNr-1, score);
		} else {
			//error case
		}	
	}
	
	//returns the score of test with testNumber (-1 in error case)
	public int getTestScore(int testNr){
		if (testNr >= 1 && testNr <= this.MAX_TESTS){
			return scores.get(testNr-1);
		} else {
			return -1;
		}
	}
	
	//setter String name
	public void setName(String name){
		this.name = name;
	}
	
	//getter String name
	public String getName(){
		return this.name;
	}
	
	//setter Major major
	public void setMajor(Major major){
		this.major = major;
	}
	
	// getter Major major
	public Major getMajor(){
		return this.major;
	}
	
	//setter int matrNr
	public void setMatrNr(int matrNr){
		this.matrNr = matrNr;
	}
	
	//getter int matrNr
	public int getMatrNr(){
		return this.matrNr;
	}
	
	//to compute the avg test score of this student
	public double getAvg(){
		double sum = 0;
		for (int i = 0; i < this.MAX_TESTS; i++){
			sum += this.scores.get(i);
		}
		return sum / this.MAX_TESTS;
	}
	
	//overwrite toString
	public String toString(){
	String ausgabe = "Name:\t"+name+"\nMajor:\t"+major+"\nMatrNr:\t"+matrNr+"\nAvg:\t"+this.getAvg();
	return ausgabe;	
	}
	
	

}

