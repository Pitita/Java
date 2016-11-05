package serie5.implementation2;

public class Box {
	private int länge, breite, höhe;
	private boolean full;
	
	public Box(int länge, int breite, int höhe)
	{
		this.länge = länge;
		this.breite = breite;
		this.höhe = höhe;
		this.full = false;
	}
	
	public Box()
	{
		this.länge = 1;
		this.breite = 1;
		this.höhe = 1;
		this.full = false;
	}
	
	/* Getter */
	public int getLänge(){ return this.länge; }
	public int getBreite(){ return this.breite; }
	public int getHöhe(){ return this.höhe; }
	public boolean getFull(){ return this.full; }
	
	/* Setter */
	public void setLänge(int länge){ this.länge = länge; }
	public void setBreite(int breite){ this.breite = breite; }
	public void setHöhe(int höhe){ this.höhe = höhe; }
	public void setFull(boolean full){ this.full = full; }
	
	/* ToString */
	public String toString(){ return "\n L:" + this.länge + "\tB:" + this.breite + "\tH:" + this.höhe + "\tF:" + this.full + "\tV:" +getCapacity(); }
	
	/* returns volume */
	public int getCapacity(){ return this.länge * this.breite * this.höhe; }
	
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box(3, 3, 3);
		Box b4 = new Box(4, 4, 4);
		
		b1.setLänge(22); b1.setBreite(12); b1.setHöhe(158); b1.setFull(true);
		b2.setLänge(211); b2.setBreite(276); b2.setHöhe(22); b2.setFull(false);
		b3.setLänge(1); b3.setBreite(2); b3.setHöhe(3); b3.setFull(true);
		b4.setLänge(44); b4.setBreite(55); b4.setHöhe(66); b4.setFull(false);
		
		System.out.print(b1.toString()+b2+b3+b4);
	}
}
