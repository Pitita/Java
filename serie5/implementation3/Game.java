package serie5.implementation3;

public class Game {

	public static void main(String[] args) {
		Player p1 = new Player("Blubella", 30);
		Player p2 = new Player("Marill", 20);
		
		Team t1 = new Team(p1, p2);
		
		System.out.println(t1);
		System.out.println(t1.getAge());

	}

}
