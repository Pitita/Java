package serie8.aufg8;

public class Bike implements Vehicel {
	private int wheels = 2;
	private String start = "Nagnagnag!";

	public int getNumberOfWheels() {
		return this.wheels;
	}

	public void start() {
		System.out.println(this.start);
	}

}
