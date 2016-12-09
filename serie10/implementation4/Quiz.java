package serie10.implementation4;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	
	private final int MAX_NUM_OFQUESTIONS = 10;
	
	private Question[] questions;
	
	private int questionCount;
	
	public Quiz(){
		this.questions = new Question[this.MAX_NUM_OFQUESTIONS];
		this.questionCount = 0;
	}
	
	public void addQuestion(Question question)	{
		if(this.questionCount < this.MAX_NUM_OFQUESTIONS) {
			this.questions[this.questionCount] = question;
			this.questionCount++;
		} else {
			System.out.println("maximale Anzahl an Fragen erreicht!");
		}
	}
	
	public void addQuestion() {
		if(this.questionCount < this.MAX_NUM_OFQUESTIONS) {
			System.out.println("Frage eingeben!");
			Scanner s = new Scanner(System.in);
			String query = s.nextLine();
			System.out.println("Antwort eingeben!");
			String answer = s.nextLine();
			Question q = new Question(query, answer);
			this.questions[this.questionCount] = q;
			this.questionCount++;
		} else {
			System.out.println("maximale Anzahl an Fragen erreicht!");
		}
	}
	
	public void startQuiz() {	
		int correctCount = 0, questionCount = 0;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		String decision = "Y";
		
		while(decision.equalsIgnoreCase("Y"))
		{
			questionCount++;
			
			int choice = r.nextInt(this.questionCount);
			Question actualQuestion = this.questions[choice];
			System.out.println(actualQuestion.getQuestion());
			
			System.out.println("Bitte Antwort eingeben");
			String candidateAnswer = s.nextLine();
			
			if(actualQuestion.answerCorrect(candidateAnswer)) {
				System.out.println("Das war richtig!");
				correctCount++;
			}
			else
			{
				System.out.println("Leider falsch! Korrekt wäre");
				System.out.println(actualQuestion.getAnswer());
			}
			
			System.out.println("Weitere Frage beantworten? (Y/N)");
			decision = s.nextLine();
		}
		
		System.out.println("Quiz beendet: Richtig waren " + correctCount + " von " + questionCount + ".");

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Quiz quiz = new Quiz();
		Question q1 = new Question("Frage1", "Antwort1");
		Question q2 = new Question("Frage2", "Antwort2");
		Question q3 = new Question("Frage3", "Antwort3");
		
		quiz.addQuestion(q1);
		quiz.addQuestion(q2);
		quiz.addQuestion(q3);
		
		System.out.println("1: Frage eingeben | 2: Quiz starten | 3: Exit");
		int decision = s.nextInt();
		
		while(decision < 3){
			if(decision==2){
				quiz.startQuiz();
			}
			else if(decision==1)
			{
				quiz.addQuestion();
			}
			System.out.println("1: Frage eingeben | 2: Quiz starten | 3: Exit");
			decision = s.nextInt();
		}
		
	}
}
