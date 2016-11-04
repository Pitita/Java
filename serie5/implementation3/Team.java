package serie5.implementation3;

public class Team {
	
	//Instanzdaten
	private Player player1, player2;
	
	// Konstruktor
	public Team(Player p1, Player p2)
	{
		this.player1 = p1;
		this.player2 = p2;
	}
	
	// Gibt das Alter von beiden Spielern addiert zurück
	public int getAge(){ return this.player1.getAge() + this.player2.getAge(); }
	public String toString() { return "*** TEAM ***\n" + this.player1.toString() + "\n" + this.player2.toString() + "\n"; }
}
