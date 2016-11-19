package serie4.implementation4;

public class Table {
	
	private int länge, breite, höhe;
	private Material material;
	
	public Table(int länge, int breite, int höhe, Material material){
		this.länge = länge;
		this.breite = breite;
		this.höhe = höhe;
		this.material = material;
	}
	
	/* Getter */
	public int getLänge(){ return länge; }
	public int getBreite(){	return breite; }
	public int getHöhe(){ return höhe; 	}
	public Material getMaterial(){ return material; }
	
	/* Setter */
	public void setLänge(int länge) { this.länge = länge; }
	public void setBreite(int breite) { this.breite = breite; }
	public void setHöhe(int höhe) { this.höhe = höhe; }
	public void setMaterial(Material material) { this.material = material; }
	
	/* ToString */
	public String toString() { return "L: " + länge + "\t | B: " + breite + "\t | H:" + höhe + "\t | Mat: " + material; }

}
