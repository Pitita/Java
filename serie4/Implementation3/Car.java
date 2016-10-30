package serie4.Implementation3;

public class Car {
	
	private String marke, modell;
	private int baujahr;

	public Car(String marke, String modell, int baujahr)
	{
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}
	
	/* Getter */
	public String getMarke(){
		return marke;
	}

	public String getModell(){
		return modell;
	}

	public int getBaujahr(){
		return baujahr;
	}
	
	/* Setter */
	public void setMarke(String marke){
		this.marke = marke;
	}
	public void setModell(String modell){
		this.modell = modell;
	}
	public void setBaujahr(int baujahr){
		this.baujahr = baujahr;
	}
	
	/* toString() */
	public String toString(){
		return "Marke: " + marke + " | Modell: " + modell + " | Baujahr: " + baujahr; 
	}
	
	/* MAIN */
	public static void main(String[] args) {
		Car c = new Car("BMW", "XD_CHE2000", 2000);
		System.out.println(c.toString()); // Marke: BMW | Modell: XD_CHE2000 | Baujahr: 2000
	}
}
