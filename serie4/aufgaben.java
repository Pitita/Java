package serie4;

import serie4.Student.Major;

public class aufgaben {
	
	enum CardSuit {clubs, diamonds, hearts, spades}

	public static void main(String[] args) {
		
		/* Aufgabe 1
		 * clubs
		 * hearts
		 * 0
		 * 2
		 */
		
		System.out.println("Aufgabe 1");
		CardSuit card1, card2;
		card1 = CardSuit.clubs;
		card2 = CardSuit.hearts;
		
		System.out.println(card1);
		System.out.println(card2.name());
		System.out.println(card1.ordinal());
		System.out.println(card2.ordinal());;
		System.out.println("-------------------");
		
		/* Aufgabe 2
		 * Typensicherheit (ich stelle sicher, dass ich die richtigen Werte verwende. Enums können ausserdem nicht überschrieben werden.)
		 * Gegenbeispiel
		 * card1 = "hearts";
		 * card1 = "something";
		 */
		
		/* Aufgabe 3 */
		
		System.out.println("Aufgabe 3");
		System.out.println(Integer.MAX_VALUE);
		System.out.println("-------------------");
		
		int i = Integer.MAX_VALUE + 1;
		System.out.println(i);
		
		/* Aufgabe 4 */
		Double d = new Double(3.456);
		
		/* Aufgabe 5 
		 * 
		 * public void Book()
		{
			int Bookid;
			int Libraryid;
			int Userid = 0; // 0 = available, not borrowed
			String title;
			String author;
			String publish_date;
			String description;
		}
		
		public void UpdateBook(); // update information
		public void DeleteBook(); // book has been taken out of service, book was lost, book is damaged
		public void AddBook(); // adds new Book
		public ArrayList<Book> ListBooks(); // lists books
	*/
		
				
		/* Aufgabe 6 
		 * Ein Objekt wird aus einer Klasse instanziert. Eine Klasse kann nicht instanziert werden. */
		
		
		/* Aufgabe 7 
		 *  faceValue = 1
		 *  diese Variabel wurden initialisiert und dies bezeichnet man als Instanzdaten. */
		
		/* Aufgabe 8 
		 * roll()
		 * setFaceValue()*/
		
		/* Aufgabe 9
		 * Das Objekt wird durch die Mehtode toString() ausgegeben;
		 */
		
		System.out.println("Aufgabe 9");
		Student s = new Student("Matt", Major.Info, 329874);
		System.out.print(s);
		System.out.println("-------------------");
		
		/* Aufgabe 10
		 * Scope ist der der Bereich, in dem die Variable gültig ist. / Scope ist der Bereich, wo auf die Variable zugegriffen werden kann.
		 */
		
		/* Aufgabe 11
		 * Java ist eine objektorientierte Programmiersprache und im Normalfall wird man je nach Projekt nicht nur mit einer Klasse, sondern mit sehr vielen Klassen arbeiten. 
		 * Wenn dann am Projekt nicht nur eine Person, sondern eine ganze Gruppe arbeitet, dann müssen im Programm selbst Vorkehrungen getroffen werden um mögliche Fehler schon im Vorhinein auszuschließen. 
		 * Hilfreich ist dabei die sogenannte Datenkapselung
		 * 
		 * Mögliche Zugriffsarten bei der Kapselung
		 * public (+) - Zugriff von außerhalb und innerhalb der Klasse möglich
		 * private (-) - Zugriff nur innerhalb der Klasse möglich
		 * protected (#) - Zugriff nur innerhalb der Klasse und von Spezialisierungen derselben
		 */
		
		/* Aufgabe 12
		 * Ein Interface ist eine Schnittstelle, in der festgelegt wird, über welche Methoden die Klassen, die das Interface implementieren, verfügen müssen. 
		 * Die Interfaces selber enthalten daher nur Funktionsköpfe und Konstanten. Alle Klassen, die das Interface implementieren, müssen sämtliche Methoden, die das Interface vorgibt, enthalten.
		 * http://www.java-tutorial.org/objektorientierung-interfaces.html
		 */
		
		/* Aufgabe 13
		 * Weil sich Konstanten nicht ändern, ist es üblich diese als public zu deklarieren
		 */
		
	}

}
