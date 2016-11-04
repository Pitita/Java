package serie5.challenge;

enum Fachgebiet {WI,BOEK}

public class Teacher {
	private String name;
	private int raumnNr;
	private Fachgebiet fachgebiet;
	
	public Teacher(String name, int raumNr, Fachgebiet fachgebiet)
	{
		this.name = name;
		this.raumnNr = raumNr;
		this.fachgebiet = fachgebiet;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getRaumnNr() { return raumnNr; }
	public void setRaumnNr(int raumnNr) { this.raumnNr = raumnNr; }
	public Fachgebiet getFachgebiet() { return fachgebiet; }
	public void setFachgebiet(Fachgebiet fachgebiet) { this.fachgebiet = fachgebiet; }
	
	public String toString() { return "Name: " + this.name + " | RaumNr: " + this.raumnNr + " | Fachgebiet:" + this.fachgebiet;}
}
