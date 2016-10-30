package serie4;

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
		
		/* Aufgabe 5 */
		
		/* Aufgabe 6 */
		
		/* Aufgabe 7 */
		
		/* Aufgabe 8 */
		
		
	}

}
